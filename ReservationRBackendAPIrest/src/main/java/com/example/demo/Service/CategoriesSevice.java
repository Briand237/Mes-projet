package com.example.demo.Service;

import java.util.List;

import com.example.demo.modeles.Categories;

public interface CategoriesSevice {


// Read operation
	List<Categories> fetchCategoriesList();
	
// Save operation
	Categories saveCategories(Categories alimentation);
	
// Update operation
	Categories updateCategories(Categories alimentation, Long alimentId);

// Delete operation
	void deleteCategoriesByRollNumber (long alimentationId);

}