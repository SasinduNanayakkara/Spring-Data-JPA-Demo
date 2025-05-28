package com.jpa.demo.repositories;

import com.jpa.demo.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

    //=============================== JPA query methods ================================
//    List<Author> findAllByFirstName(String firstName);
//    Author findByEmail(String email);
//    List<Author> findAllByFirstNameIgnoreCase(String firstName);
//    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);

    //=============================== JPQL ================================

//    @Query("SELECT a FROM Author a WHERE a.firstName = :firstName")
//    List<Author> findAllByFirstName(@Param("firstName") String firstName);
//
//    @Query("SELECT a FROM Author a WHERE a.email = :email")
//    Author findByEmail(@Param("email") String email);
//
//    @Query("SELECT a FROM Author a WHERE LOWER(a.firstName) = LOWER(:firstName)")
//    List<Author> findAllByFirstNameIgnoreCase(@Param("firstName") String firstName);
//
//    @Query("SELECT a FROM Author a WHERE LOWER(a.firstName) LIKE LOWER(CONCAT('%', :firstName, '%'))")
//    List<Author> findAllByFirstNameContainingIgnoreCase(@Param("firstName") String firstName);

    //=============================== Native SQL queries ================================

    @Query(value = "SELECT * FROM Author a WHERE a.firstName = :firstName", nativeQuery = true)
    List<Author> findAllByFirstName(@Param("firstName") String firstName);

    @Query(value = "SELECT * FROM Author a WHERE a.email = :email", nativeQuery = true)
    Author findByEmail(@Param("email") String email);

    @Query(value = "SELECT * FROM Author a WHERE LOWER(a.firstName) = LOWER(:firstName)", nativeQuery = true)
    List<Author> findAllByFirstNameIgnoreCase(@Param("firstName") String firstName);

    @Query(value = "SELECT * FROM Author a WHERE LOWER(a.firstName) LIKE LOWER(CONCAT('%', :firstName, '%'))", nativeQuery = true)
    List<Author> findAllByFirstNameContainingIgnoreCase(@Param("firstName") String firstName);
}
