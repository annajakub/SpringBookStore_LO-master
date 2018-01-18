package com.sda.springstarter.demo.exception;

import com.sda.springstarter.demo.model.Author;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionHandlerAdvice2 {

    @ControllerAdvice
    public class ExceptionHandlerAdvice {

        @ExceptionHandler(AuthorNotFoundException.class)
        public ResponseEntity handleException(BookNotFoundException e){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(new ApiError(HttpStatus.NOT_FOUND, "Nie znaleziono autora", "Blad"));
        }


    }

}
