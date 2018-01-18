package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();
    void saveAuthor(Author author);

    Author getAuthorsByName(String name);
}
