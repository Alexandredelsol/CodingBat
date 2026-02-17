package com.codingbat.warmup1;

public class HasTeen {
    private static boolean isTeen(int value) {
        return value >= 13 && value <= 19;
    }
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
}
