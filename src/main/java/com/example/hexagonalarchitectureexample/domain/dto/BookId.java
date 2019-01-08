package com.example.hexagonalarchitectureexample.domain.dto;

import lombok.Value;

@Value(staticConstructor = "of")
public class BookId {
    private final String raw;
}
