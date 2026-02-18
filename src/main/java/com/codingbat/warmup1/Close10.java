package com.codingbat.warmup1;

public class Close10 {
    public static int close10(int a, int b) {
        int diffA = Math.abs(a - 10);
        int diffB = Math.abs(b - 10);

        return diffA == diffB ? 0 : (diffA < diffB ? a : b);
    }
}
