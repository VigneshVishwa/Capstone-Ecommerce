package com.cakesandbakes.major.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cakesandbakes.major.model.Category;
import com.cakesandbakes.major.repository.CategoryRepository;
@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	public List<Category> getAllCategory(){
		return categoryRepository.findAll();
	}
	
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}
}
