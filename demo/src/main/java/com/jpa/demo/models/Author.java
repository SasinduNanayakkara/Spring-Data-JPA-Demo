package com.jpa.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
//@Table(name = "DEMO_AUTHOR")
@AllArgsConstructor
//@Builder
@SuperBuilder
public class Author {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
