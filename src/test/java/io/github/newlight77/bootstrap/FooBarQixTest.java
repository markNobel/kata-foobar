package io.github.newlight77.bootstrap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FooBarQixTest {

    private FooBarQix fooBarQix;

    @BeforeEach
    void setUp(){
        fooBarQix = new FooBarQix();
    }

    @Test
    void shouldReturnAsIs_WhenIsOne() {
        // Given

        // When
        String result = fooBarQix.compute("1");

        // Then
        assertEquals( "1", result);
    }

    @Test
    void shouldReturnAsIs_WhenIsTwo() {
        // Given

        // When
        String result = fooBarQix.compute("2");

        // Then
        assertEquals( "2", result);
    }

    @Test
    void shouldReturnFooFoo_WhenTheNumberIs3() {
        // Given

        // When
        String result = fooBarQix.compute("3");

        // Then
        assertEquals( "FooFoo", result);
    }

    @Test
    void shouldReturnFoo_WhenTheNumberIs6() {
        // Given

        // When
        String result = fooBarQix.compute("6");

        // Then
        assertEquals( "Foo", result);
    }

    @Test
    void shouldReturnBar_WhenTheNumberIs5() {
        // Given

        // When
        String result = fooBarQix.compute("5");

        // Then
        assertEquals( "Bar", result);
    }

    @Test
    void shouldReturnQix_WhenTheNumberIs7() {
        // Given

        // When
        String result = fooBarQix.compute("7");

        // Then
        assertEquals( "Qix", result);
    }
}
