package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryService;
/**
 * 
 * @author vominhtung
 *
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

}
