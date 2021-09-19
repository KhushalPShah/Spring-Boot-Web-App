package com.learningspringboot.SpringBootWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learningspringboot.SpringBootWebApp.model.Author;
import com.learningspringboot.SpringBootWebApp.model.Book;
import com.learningspringboot.SpringBootWebApp.repositories.AuthorRepository;
import com.learningspringboot.SpringBootWebApp.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner{

	private final AuthorRepository authRepo;
	private final BookRepository bookRepo;
	
	public BootstrapData(AuthorRepository authRepo, BookRepository bookRepo) {
		this.authRepo = authRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Author agatha = new Author("Agatha","Christie");
		Book abcMurders = new Book("101990","ABC Murders");
		agatha.getBooks().add(abcMurders);
		abcMurders.getAuthor().add(agatha);
		
		authRepo.save(agatha);
		bookRepo.save(abcMurders);
		
		System.out.println("Bootstrapping the Database with Initial Data");
		System.out.println("Number of Books : " + bookRepo.count() + " and Number of Authors : " + authRepo.count());
		
		
		
		
	}
	
	

}
