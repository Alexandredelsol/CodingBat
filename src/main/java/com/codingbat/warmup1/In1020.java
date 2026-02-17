package com.codingbat.warmup1;

public class In1020 {
    private static boolean inRange10to20(int n) {
        return n >= 10 && n <= 20;
    }
    public static boolean in1020(int a, int b) {

        return inRange10to20(a) || inRange10to20(b);
    }

}
