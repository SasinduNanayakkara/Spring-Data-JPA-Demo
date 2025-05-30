package com.jpa.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
public class Section extends BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int sectionOrder;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;
}
