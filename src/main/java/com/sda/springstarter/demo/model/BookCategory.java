package com.sda.springstarter.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "kategoria")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(mappedBy = "bookCategory", cascade = CascadeType.ALL)
    private Set<Book> books;


    public BookCategory() {
    }

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Set<Book> getBooks() {
//        return books;
//    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}