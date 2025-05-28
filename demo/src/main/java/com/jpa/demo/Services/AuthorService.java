package com.jpa.demo.Services;

import com.jpa.demo.models.Author;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AuthorService {
    ResponseEntity<List<Author>> getAuthorsByFirstName(String firstName);
}
