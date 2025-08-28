package com.example.demo.modeles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdCategories;
	private String Name;
	private String Description;
	
	
	public long getIdCategories() {
		return IdCategories;
	}
	public void setIdCategories(long idCategories) {
		IdCategories = idCategories;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public void getName(String name2) {
		// TODO Auto-generated method stub
		
	}

}
