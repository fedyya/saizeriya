package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.example.demo.db.Menu;
import com.example.demo.db.MenuRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ImageService {
	@Autowired
	MenuRepository menurepo;
	
	public static Map<Integer, String> image = new HashMap<>();

	@PostConstruct
    public void encodeImagesOnStartup() throws IOException {
		System.out.println("画像データをbase64に変換中");
        List<Menu> menu = menurepo.findAll();
        for (Menu m : menu) {
        	String path = m.getPath();
        	if (path.equals(" ")) {
        		continue;
        	}
        	
        	try {
        		Path imagePath = Paths.get("src/main/resources/static/" + path);
        		byte[] imageBytes = Files.readAllBytes(imagePath);
        		String base64Encoded = Base64Utils.encodeToString(imageBytes);
        		image.put(m.getId(), base64Encoded);        		
        	} catch(Exception e) {
        		System.err.println("「" + m.getName() + "」の画像データが見つかりません");
        		continue;
        	}
        }
        System.out.println("画像データ変換終了");
    }
}
