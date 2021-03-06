package com.learningspringboot.SpringBootWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learningspringboot.SpringBootWebApp.repositories.BookRepository;

@Controller
public class BookController {
	
	private final BookRepository bookRepo;
	
	
	
	public BookController(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}



	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRepo.findAll()); 
		
		return "books/list";
	}

}
