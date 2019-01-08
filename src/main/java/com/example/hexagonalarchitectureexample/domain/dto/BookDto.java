package com.example.hexagonalarchitectureexample.domain.dto;

import lombok.Value;

@Value
public class BookDto {
    private final BookId bookId;
    private final String title;
    private final String author;
}
