package com.codingbat.warmup1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    @Test
    void testDelDel() {
        assertEquals("abc", DelDel.delDel("adelbc"));     
        assertEquals("aHello", DelDel.delDel("adelHello"));
        assertEquals("adedbc", DelDel.delDel("adedbc"));  
        assertEquals("abc", DelDel.delDel("abc"));        
        assertEquals("", DelDel.delDel(""));              
    }
}
