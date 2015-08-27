package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.BookService;
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
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap mm){
		mm.addAttribute("books", bookService.findAll());
		return "index";
	}
}
