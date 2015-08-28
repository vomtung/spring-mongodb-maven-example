package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.BookService;
import com.example.service.CategoryService;
/**
 * 
 * @author vominhtung
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap mm){
		mm.addAttribute("books", bookService.findAll());
		mm.addAttribute("categories", categoryService.findAll());
		return "index";
	}
}
