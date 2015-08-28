package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Book;
import com.example.service.BookService;
/**
 * 
 * @author vominhtung
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping("/detail")
	public String bookDetail(@RequestParam String id, ModelMap mm){
		Book book = bookService.findByIf(id);
		if(book!=null){
			mm.addAttribute("book", bookService.findByIf(id));
		}
		return "book/book_detail";
	}
}
