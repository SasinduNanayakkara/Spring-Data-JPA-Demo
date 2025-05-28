package com.jpa.demo.Controllers;

import com.jpa.demo.Services.AuthorService;
import com.jpa.demo.models.Author;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public ResponseEntity<List<Author>> getAuthorsByFirstName(@RequestParam String firstName) {
        return authorService.getAuthorsByFirstName(firstName);
    }
}
