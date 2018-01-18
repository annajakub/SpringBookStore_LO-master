package com.sda.springstarter.demo.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(int id){
        super("Could not found book" + id);
    }

}
