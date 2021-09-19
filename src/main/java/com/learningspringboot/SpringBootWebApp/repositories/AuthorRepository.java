package com.learningspringboot.SpringBootWebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.learningspringboot.SpringBootWebApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
