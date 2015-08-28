package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
/**
 * 
 * @author vominhtung
 *
 */
@Service("bookService")
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	public Book findByIf(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

	
}
