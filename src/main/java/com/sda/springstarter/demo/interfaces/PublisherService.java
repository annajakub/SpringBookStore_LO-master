package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.Book;
import com.sda.springstarter.demo.model.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAllPublishers();
    void savePublisher(Publisher publisher);
}
