package com.codingbat.warmup1;

public class EndUp {
    public static String endUp(String str) {
        if (str.length() >= 3) {
            String firstPart = str.substring(0, str.length() - 3);
            String lastPart = str.substring(str.length() - 3).toUpperCase();
            return firstPart + lastPart;
        }
        return str.toUpperCase();
    }
}
