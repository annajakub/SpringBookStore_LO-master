package com.sda.springstarter.demo;

import com.sda.springstarter.demo.interfaces.AuthorService;
import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Book book1 = new Book("Tytul", "Autor");
//		Book book2 = new Book("Tytul2", "Autor2");
//
//
		Author author = authorRepository.findById(1);
		Book book = new Book();
		book.setTitle("Java dla bystrzakow");
		//book.setBookAuthor(author);
		bookService.saveBook(book);

		Optional<Author> author1 = authorRepository.getAuthorsByName("Anna"); //todo
		Book book1 = new Book();


//
//
//
//		bookService.saveBook(book1);
//		bookService.saveBook(book2);
//
//		bookService.saveBook(book);

	}
}
