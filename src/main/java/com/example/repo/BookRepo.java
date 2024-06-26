package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BookEntity;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}
