package com.codingbat.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Close10Test {

    @Test
    void testClose10() {
        assertEquals(8, Close10.close10(8, 13));
        assertEquals(8, Close10.close10(13, 8));
        assertEquals(0, Close10.close10(13, 7));
        assertEquals(10, Close10.close10(10, 15));
        assertEquals(10, Close10.close10(15, 10));
    }
}