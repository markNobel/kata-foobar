package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    @Test
    void shouldReturnAsIs_WhenIsOne() {
        // Given
        FooBarQix fooBarQix = new FooBarQix();

        // When
        String result = fooBarQix.compute("1");

        // Then
        assertEquals( "1", result);
    }

    @Test
    void shouldReturnAsIs_WhenIsTwo() {
        // Given
        FooBarQix fooBarQix = new FooBarQix();

        // When
        String result = fooBarQix.compute("2");

        // Then
        assertEquals( "2", result);
    }


}
