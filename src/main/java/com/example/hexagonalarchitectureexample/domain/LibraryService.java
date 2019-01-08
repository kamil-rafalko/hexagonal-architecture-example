package com.example.hexagonalarchitectureexample.domain;

import com.example.hexagonalarchitectureexample.domain.dto.AddBookCommand;
import com.example.hexagonalarchitectureexample.domain.dto.BookDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
class LibraryService {

    private final BookRepository bookRepository;

    BookDto addBook(AddBookCommand command) {
        return bookRepository.save(command.toDto());
    }
}
