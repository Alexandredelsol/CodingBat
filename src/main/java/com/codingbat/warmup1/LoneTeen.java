package com.codingbat.warmup1;

public class LoneTeen {
    private static boolean oneIsTeen(int value) {
        return value >= 13 && value <= 19;
    }
    public static boolean loneTeen(int a, int b) {
        return oneIsTeen(a) ^ oneIsTeen(b);
    }

}
