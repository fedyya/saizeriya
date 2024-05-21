package com.example.demo.db;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReturnJson {
	private int id;
	private int price;
	private int calorie;
	private int salt;
	private String name;
	private String img;
	private String[] allergy;
	
	public ReturnJson(Menu menu, AllergyList allergy) {
		
	}
}
