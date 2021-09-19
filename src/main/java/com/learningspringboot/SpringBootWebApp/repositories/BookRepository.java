package com.learningspringboot.SpringBootWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.learningspringboot.SpringBootWebApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
