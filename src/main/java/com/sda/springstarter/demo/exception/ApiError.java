package com.sda.springstarter.demo.exception;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiError {

    private HttpStatus status;
    private String massage;
    private List<String>errors;


    public ApiError(HttpStatus status, String massage, List<String> errors) {

        this.status = status;
        this.massage = massage;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String massage, String error) {

        this.status = status;
        this.massage = massage;
        errors = Arrays.asList(error);
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMassage() {
        return massage;
    }

    public List<String> getErrors() {
        return errors;
    }
}
