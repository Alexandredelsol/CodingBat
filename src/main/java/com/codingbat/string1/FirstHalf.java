package com.codingbat.string1;

public class FirstHalf {
    public static String firstHalf(String str) {
        int middleString = str.length() / 2;
        return str.substring(0,middleString);
    }

}
