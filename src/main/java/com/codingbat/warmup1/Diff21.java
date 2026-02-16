package com.codingbat.warmup1;

public class Diff21 {
    public static int diff21(int n) {
        int diff = n - 21;
        return (diff > 0) ? diff * 2 : -diff;
    }
}
