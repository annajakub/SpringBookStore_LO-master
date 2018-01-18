package com.sda.springstarter.demo.service;

import com.sda.springstarter.demo.interfaces.BookCategoryService;

import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.repository.BookCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {


    @Autowired
    private BookCategoryRepository bookCategoryRepository;


    @Override
    public List<BookCategory> getAllBooksCategory() {
        return bookCategoryRepository.findAll();
    }

    @Override
    public void saveBookCategory(BookCategory bookCategory) {
        bookCategoryRepository.save(bookCategory);
    }
}

