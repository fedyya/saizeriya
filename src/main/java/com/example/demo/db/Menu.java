package com.example.demo.db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Menu {
	@Id
	@GeneratedValue
	private int id;
	
	private int price;
	private int calorie;
	private String name;
	private String path;
}
