package com.sda.springstarter.demo.controller;

import com.sda.springstarter.demo.interfaces.BookService;
import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Publisher;
import com.sda.springstarter.demo.service.AuthorServiceImpl;
import com.sda.springstarter.demo.service.BookCategoryServiceImpl;
import com.sda.springstarter.demo.service.BookServiceImpl;
import com.sda.springstarter.demo.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;
    @Autowired
    private AuthorServiceImpl authorService;
    @Autowired
    private PublisherServiceImpl publisherService;
    @Autowired
    private BookCategoryServiceImpl bookCategoryService;


    @GetMapping(value = "list")
    public ModelAndView showBooks(){
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks()); //dodalismy kolekcję
        model.addObject("categories", bookCategoryService.getAllBooksCategory());
        model.addObject("publishers", publisherService.getAllPublishers());
        model.addObject("book", new Book());
        model.setViewName("booklist");
        return model;
    }

    @PostMapping(value = "addbook")
    public String addBook(@ModelAttribute("book") //wskazujemy nazwę obiektu, kt dostajemy z formularza
                                @Valid Book book, //pilnuje, żeby nie weszło nic spoza zakresu
                                BindingResult bookresult, //przechowuje informace o błędach
                                RedirectAttributes redirectAttributes){ //można wysłać informację zwrotną
        bookService.saveBook(book);
        redirectAttributes.addFlashAttribute("message","Successfully added ..."); //flash message - komunikat zwrotny

        return "redirect:/list";
    }

    @GetMapping(value = "list2")
    public ModelAndView showAuthors(){
        ModelAndView model2 = new ModelAndView();
        model2.addObject("authors", authorService.getAllAuthors()); //dodalismy kolekcję
        model2.setViewName("authorlist");
        return model2;
    }

    @GetMapping(value = "list3")
    public ModelAndView showPublishers(){
        ModelAndView model3 = new ModelAndView();
        model3.addObject("publishers", publisherService.getAllPublishers());
        model3.setViewName("publisherlist");
        return model3;
    }

}
