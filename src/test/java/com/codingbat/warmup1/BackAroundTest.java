package com.codingbat.warmup1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {

    @ParameterizedTest
    @CsvSource({
            "cat, tcatt",
            "Hello, oHelloo",
            "a, aaa"
    })
    void testBackAround(String input, String expected) {
        assertEquals(expected, BackAround.backAround(input));
    }
}