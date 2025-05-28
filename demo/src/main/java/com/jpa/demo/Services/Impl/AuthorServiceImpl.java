package com.jpa.demo.Services.Impl;

import com.jpa.demo.Services.AuthorService;
import com.jpa.demo.models.Author;
import com.jpa.demo.repositories.AuthorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public ResponseEntity<List<Author>> getAuthorsByFirstName(String firstName) {
        try {
            List<Author> authors = authorRepository.findAllByFirstName(firstName);
            if (authors.isEmpty()) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(authors);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
