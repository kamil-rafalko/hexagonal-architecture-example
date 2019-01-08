package com.example.hexagonalarchitectureexample.adapters;

import com.example.hexagonalarchitectureexample.adapters.entities.Book;
import org.springframework.data.repository.Repository;

public interface SpringBookRepository extends Repository<Book, Long> {
    void save(Book entity);
}
