package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
