package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.db.Menu;
import com.example.demo.db.MenuRepository;


@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Autowired
	MenuRepository menurepo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("コマンドラインを開始します");
		
		List<Menu> menu_list = menurepo.findAll();
		
		System.out.println("コマンドラインを終了しました");
	}
}
