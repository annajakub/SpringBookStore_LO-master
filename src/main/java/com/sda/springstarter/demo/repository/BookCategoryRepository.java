package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {
}
