package com.example.hexagonalarchitectureexample.adapters.entities;

import com.example.hexagonalarchitectureexample.domain.dto.BookDto;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Table(name = "book")
@NoArgsConstructor(access = PRIVATE)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name = "book_generator", sequenceName = "book_seq")
    private Long id;
    private String bookId;
    private String title;
    private String author;

    private Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public static Book fromDto(BookDto dto) {
        return new Book(dto.getBookId().getRaw(), dto.getTitle(), dto.getAuthor());
    }
}
