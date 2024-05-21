package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.Menu;

@RestController
public class MyRestController {
	@CrossOrigin(origins = "*")
	@GetMapping("/")
	public Menu From() {
		Menu menu = new Menu();
		return menu;
	}
}
