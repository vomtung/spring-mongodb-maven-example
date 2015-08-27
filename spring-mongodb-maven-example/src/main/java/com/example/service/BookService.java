package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Book;

/**
 * 
 * @author vominhtung
 *
 */
@Service
public interface BookService {

	List<Book>	findAll();
}
