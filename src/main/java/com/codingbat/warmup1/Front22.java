package com.codingbat.warmup1;

public class Front22 {
    public static String front22(String str) {
        int stringLength = str.length();

        if (stringLength <= 2) return str + str + str;
        String twoFirstLetter = str.substring(0,2);
        return twoFirstLetter + str + twoFirstLetter;
    }
}
