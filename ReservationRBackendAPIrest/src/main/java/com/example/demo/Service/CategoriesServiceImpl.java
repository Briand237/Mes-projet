package com.example.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.modeles.Categories;
import com.example.demo.repository.CategoriesRepository;

public class CategoriesServiceImpl implements CategoriesSevice {
	
	
	@Autowired
	private CategoriesRepository categoriesRepository ;

	@Override
	public List<Categories> fetchCategoriesList() {
		// TODO Auto-generated method stub
		return (List<Categories>)
				categoriesRepository.findAll();
	}

	@Override
	public Categories saveCategories(Categories categories) {
		// TODO Auto-generated method stub
		return categoriesRepository.save(categories);
	}

	@Override
	public Categories updateCategories(Categories categories, Long categoriesRollNumber){
		Categories stuDB = categoriesRepository.findById(categoriesRollNumber).get();
		
		if(Objects.nonNull(categories.getName()) && !"".equalsIgnoreCase(categories.getName())) {
			stuDB.getName(categories.getName());
		}
		if (Objects.isNull(categories.getDescription()) && !"" .equalsIgnoreCase(categories.getDescription())){
			stuDB.setDescription(categories.getDescription());	
		}
		return categoriesRepository.save(stuDB);
	}

	@Override
	public void deleteCategoriesByRollNumber(long alimentationId) {
		// TODO Auto-generated method stub
		
	}

}
