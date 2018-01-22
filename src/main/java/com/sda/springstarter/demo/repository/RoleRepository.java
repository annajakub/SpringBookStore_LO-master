package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {

    Roles findByRole(String role);
}
