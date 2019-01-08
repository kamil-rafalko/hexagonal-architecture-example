package com.example.hexagonalarchitectureexample.domain;

import com.example.hexagonalarchitectureexample.adapters.JpaBookRepository;
import com.example.hexagonalarchitectureexample.adapters.SpringBookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfiguration {

    @Bean
    LibraryService libraryService(SpringBookRepository springBookRepository) {
        return new LibraryService(new JpaBookRepository(springBookRepository));
    }
}
