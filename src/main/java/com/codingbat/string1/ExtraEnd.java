package com.codingbat.string1;

public class ExtraEnd {
    public static String extraEnd(String str) {
        int stringLength = str.length();
        String lastChar = str.substring(stringLength - 2);

        return lastChar + lastChar + lastChar;

    }
}
