package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;


@Component
public class MyCommandLineRunner implements CommandLineRunner {
	@Autowired
	Repository personRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("コマンドラインを開始します");
	}
}
