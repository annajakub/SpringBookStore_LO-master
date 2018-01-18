package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    void saveBook(Book book);


    Book getBookById(int id);
}

