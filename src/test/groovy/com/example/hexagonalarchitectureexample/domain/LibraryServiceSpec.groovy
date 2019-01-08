package com.example.hexagonalarchitectureexample.domain

import com.example.hexagonalarchitectureexample.adapters.InMemoryBookRepository
import com.example.hexagonalarchitectureexample.domain.dto.AddBookCommand
import com.example.hexagonalarchitectureexample.domain.dto.BookDto
import spock.lang.Specification

class LibraryServiceSpec extends Specification {

    InMemoryBookRepository bookRepository = new InMemoryBookRepository()
    LibraryService service = new LibraryService(bookRepository)

    def "should add book"() {
        given:
            String testAuthor = "Test author"
            String testTitle = "Test title"
            AddBookCommand command = new AddBookCommand(testTitle, testAuthor)

        when:
            BookDto book = service.addBook(command)

        then:
            with(bookRepository.books.get(book.getBookId())) {
                title == testTitle
                author == testAuthor
            }
    }
}
