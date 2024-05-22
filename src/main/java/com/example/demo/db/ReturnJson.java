package com.example.demo.db;

import com.example.demo.ImageService;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReturnJson {
	private int id;
	private int price;
	private int calorie;
	private double salt;
	private String name;
	private String image;
	private String[] allergy;
	
	public ReturnJson(Menu menu) {
		this.id = menu.getId();
		this.price = menu.getPrice();
		this.calorie = menu.getCalorie();
		this.salt = menu.getSalt();
		new ImageService();
		this.name = menu.getName();
		this.image = ImageService.image.get(this.id);
		this.allergy = null;
	}
}
