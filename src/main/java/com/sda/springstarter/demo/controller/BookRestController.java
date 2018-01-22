package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.model.Author;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.BookCategory;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@Controller - oznaczamy nią kontrolery, tj. klasy, które będą obsługiwały zapytania
// wysyłane poprzez przeglądarkę od użytkowników.
@RequestMapping("/books") // Raz wywołuje. Wszystkie metody tej klasy, które mają także adnotacje @RequestMapping, są tak jakby prefiksowane
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private AuthorServiceImpl authorService;
    @Autowired
    private BookCategoryServiceImpl bookCategoryService;
    @Autowired
    private PublisherServiceImpl publisherService;

    @CrossOrigin(value = "http://localhost:9999") //dajemy dostęp metodzie na tym porcie
    @RequestMapping(method = RequestMethod.GET) //Wskazujemy, że ta metoda będzie uruchomiona,jeśli użytkownik wpisze konkretny adres URL
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getauthors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/getbookcategory")
    public List<BookCategory> getAllBookCategory() {
        return bookCategoryService.getAllBooksCategory();
    }

    @GetMapping("/getpublishers")
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }


    @CrossOrigin(value = "http://localhost:9999")
    @RequestMapping(method = RequestMethod.POST) //AKTUALIZACJA
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @PostMapping("/addbooks")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @PostMapping("/addnewbooks")
    public void saveBookCategory(@RequestBody BookCategory bookCategory) {
        bookCategoryService.saveBookCategory(bookCategory);
    }

    @PostMapping("/addbook")
    public void savePublisher(@RequestBody Publisher publisher) {
        publisherService.savePublisher(publisher);
    }

    @GetMapping(value = "{id}") // "bookByID{id}"
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(bookService.getBookById(id));

    }

    @GetMapping(value = "{name}") // "bookByID{id}"
    public ResponseEntity<Author> getBookById(@PathVariable String name) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(authorService.getAuthorsByName(name));

    }

}
