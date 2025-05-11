package com.jpa.demo.repositories;

import com.jpa.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
}
