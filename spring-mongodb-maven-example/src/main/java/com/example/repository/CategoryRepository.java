package com.example.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Category;
/**
 * 
 * @author vominhtung
 *
 */
@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

	public List<Category> findAll();
	
}
