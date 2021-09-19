package com.learningspringboot.SpringBootWebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learningspringboot.SpringBootWebApp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private final AuthorRepository authRepo;
	
	
	
	public AuthorController(AuthorRepository authRepo) {
		this.authRepo = authRepo;
	}



	@RequestMapping("/authors")
	public String getBooks(Model model) {
		
		model.addAttribute("authors", authRepo.findAll()); 
		
		return "authors/list";
	}
}
