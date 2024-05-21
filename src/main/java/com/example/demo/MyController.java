package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.db.MenuRepository;

@Controller
public class MyController {
	@Autowired
	MenuRepository menuRepository; 
	
	@GetMapping("/next")
	public String MainPage() {
		return "index";
	}
}
