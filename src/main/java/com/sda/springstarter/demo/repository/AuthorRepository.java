package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
   public Author findById(int id);

    public Optional<Author>getAuthorsByName(String name);
   // public Author findByName(String name);






}
