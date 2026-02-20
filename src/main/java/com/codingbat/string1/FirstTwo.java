package com.codingbat.string1;

public class FirstTwo {
    public static String firstTwo(String str) {
        int stringLength = str.length();
        if (stringLength > 1) return str.substring(0,2);
        return str;
    }
}
