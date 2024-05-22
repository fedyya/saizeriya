package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.Menu;
import com.example.demo.db.MenuRepository;
import com.example.demo.db.ReturnJson;

@RestController
public class MyRestController {
	@Autowired
	MenuRepository menurepo;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/")
	public List<ReturnJson> From() {
		List<Menu> menu_list = menurepo.findAll();
		
		List<ReturnJson> list = new ArrayList<ReturnJson>();
		for (Menu m: menu_list) {
			ReturnJson rj = new ReturnJson(m);
			list.add(rj);
		}
		
		return list;
	}
}
