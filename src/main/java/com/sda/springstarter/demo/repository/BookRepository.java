package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>{

public Optional <Book> findById(int id);
public Book findByTitle(String title);

}
