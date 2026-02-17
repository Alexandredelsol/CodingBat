package com.codingbat.warmup1;

public class BackAround {
    public static String backAround(String str) {
        int stringLength = str.length();

        char lastLetter = str.charAt(stringLength-1);
        return lastLetter + str + lastLetter;
    }
}
