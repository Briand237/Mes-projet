package com.example.demo.controller;

import java.util.List;
import com.example.demo.Service.CategoriesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modeles.Categories;
@RestController
public class CategoriesController {
	
	@Autowired
	private CategoriesServiceImpl categoriesService;
	
// Save operation
	@PostMapping("/categories")
	
	public Categories saveAlimentation(@Validated @RequestBody Categories categories){
		return categoriesService.saveCategories(categories);
	}
	
	@GetMapping("/categories")
	public List<Categories> fetchCategoriesList1(){
		return categoriesService.fetchCategoriesList();
	}
	
// UPdate operation 
	@PutMapping("/categories/{rollNumber}")
	@GetMapping("/categories")
	
	public List<Categories> fetchCategoriesList(){
		return categoriesService.fetchCategoriesList();
	}
	
// Update operation
	@PutMapping("/categories/{rollNumber}")
	
	public Categories updateCatgories(@RequestBody Categories categories, @PathVariable("rollNumber") Long categoriesRollNumber){
		return categoriesService.updateCategories(categories, categoriesRollNumber);	
	}
// Delete operation
	@DeleteMapping("/categories/'rollNumber}")
	
	public String deleteCategoriesByRollNumber(@PathVariable("rollNumber") Long categoriesRollNumber) {
		categoriesService.deleteCategoriesByRollNumber(categoriesRollNumber);
		return "Deleted SucessFully";
	}
}
