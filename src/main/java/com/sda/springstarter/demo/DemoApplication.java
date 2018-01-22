package com.sda.springstarter.demo;

import com.sda.springstarter.demo.interfaces.AuthorService;
import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.repository.AuthorRepository;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;  //Spring Data samo stworzy implementację naszego BookServiceImpl i wstrzyknie ją w tym miejscu.
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private AuthorServiceImpl authorService;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Author author = authorRepository.findById(1);
//		Book book = new Book();
//		book.setTitle("Java");
//		book.setBookAuthor(author);
//		bookService.saveBook(book);
//		author.setLastname("Adamkiewicz");
//		author.setName("Adam");
//		authorService.saveAuthor(author);

	}
}
