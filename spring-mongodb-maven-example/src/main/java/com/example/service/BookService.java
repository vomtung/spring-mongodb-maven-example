package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;

/**
 * 
 * @author vominhtung
 *
 */
public interface BookService {

	List<Book>	findAll();
	
	Book findByIf(String id);
}
