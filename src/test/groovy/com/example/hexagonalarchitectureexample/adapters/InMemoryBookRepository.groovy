package com.example.hexagonalarchitectureexample.adapters

import com.example.hexagonalarchitectureexample.domain.BookRepository
import com.example.hexagonalarchitectureexample.domain.dto.BookDto
import com.example.hexagonalarchitectureexample.domain.dto.BookId

class InMemoryBookRepository implements BookRepository {

    Map<BookId, BookDto> books = [:]

    BookDto save(BookDto dto) {
        books.put(dto.getBookId(), dto)
        return dto
    }
}
