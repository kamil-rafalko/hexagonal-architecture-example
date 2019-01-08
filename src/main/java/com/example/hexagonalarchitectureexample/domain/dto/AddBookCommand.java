package com.example.hexagonalarchitectureexample.domain.dto;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class AddBookCommand {
    private final String title;
    private final String author;

    public BookDto toDto() {
        return new BookDto(BookId.of(UUID.randomUUID().toString()), title, author);
    }
}
