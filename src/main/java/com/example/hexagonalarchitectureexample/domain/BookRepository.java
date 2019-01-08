package com.example.hexagonalarchitectureexample.domain;

import com.example.hexagonalarchitectureexample.domain.dto.BookDto;

public interface BookRepository {
    BookDto save(BookDto dto);
}
