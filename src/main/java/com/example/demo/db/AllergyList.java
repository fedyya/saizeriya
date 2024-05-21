package com.example.demo.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class AllergyList {
	@Id
	private int id;
	private int menu_id;
	private int allergy_id;
}
