package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modeles.Categories;


@Repository
public interface CategoriesRepository extends CrudRepository<Categories, Long> {

	List<Categories> findAll();

}
