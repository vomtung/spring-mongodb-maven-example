package com.example.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Book;
/**
 * 
 * @author vominhtung
 *
 */
@Repository
public interface BookRepository extends MongoRepository<Book, String>{

	List<Book>	findAll();
}
