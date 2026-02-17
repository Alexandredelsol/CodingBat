package com.codingbat.warmup1;

public class FrontBack {
    public static String frontBack(String str) {
        int stringLength = str.length();

        if (stringLength <= 1) return str;

        char first = str.charAt(0);
        char last = str.charAt(stringLength - 1);
        String middle = str.substring(1, stringLength - 1);

        return last + middle + first;
    }

}
