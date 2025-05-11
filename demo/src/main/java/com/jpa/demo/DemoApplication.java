package com.jpa.demo;

import com.jpa.demo.models.Author;
import com.jpa.demo.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
	public CommandLineRunner commandLineRunner (AuthorRepository authorRepository) {
		return args -> {
			var author = Author.builder()
					.firstName("Sasindu")
					.lastName("Nanayakkara")
					.email("sas.nkr50@gmail.com")
					.build();

			authorRepository.save(author);
		};

	}

}
