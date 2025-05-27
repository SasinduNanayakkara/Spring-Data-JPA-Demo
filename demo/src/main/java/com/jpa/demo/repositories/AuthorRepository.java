package com.jpa.demo.repositories;

import com.jpa.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

    List<Author> findAllByFirstName(String firstName);
    Author findByEmail(String email);
    List<Author> findAllByFirstNameIgnoreCase(String firstName);
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);
}
