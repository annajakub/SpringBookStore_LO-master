package com.sda.springstarter.demo.exception;

public class AuthorNotFoundException extends RuntimeException {

    public AuthorNotFoundException(String name){
        super("Could not found author" + name);
    }

}
