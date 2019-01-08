package com.example.hexagonalarchitectureexample.adapters;

import com.example.hexagonalarchitectureexample.adapters.entities.Book;
import com.example.hexagonalarchitectureexample.domain.BookRepository;
import com.example.hexagonalarchitectureexample.domain.dto.BookDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JpaBookRepository implements BookRepository {

    private final SpringBookRepository springRepository;

    public BookDto save(BookDto dto) {
        springRepository.save(Book.fromDto(dto));
        return dto;
    }
}
