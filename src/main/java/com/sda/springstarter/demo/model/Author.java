package com.sda.springstarter.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity //zeby miała odwzorowanie w bazie
@Table(name = "autorzy") //jeśli chcę zmienić nazwę tabeli, zeby nie miałą nazwy klasy
public class Author {

    @Id //klucz główny
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String name;

    private String lastname;
    private String address;

    @OneToMany(mappedBy = "bookAuthor", cascade = CascadeType.ALL) //1 autor posiada wiele książek, więc tworzymy listę ksiązek. Mapujemy, czyli wskazujemy pole z którym ma się połączyć, czyli z bookAuthor
    private Set<Book> books;  //zbior książek

//    public Set<Book> getBooks() {
//        return books;
//    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Author() {  //musi posiadać pusty konstruktor, bo hibernate go potrzebuje
    }

    public Author(String name, String lastname, String address) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
