package com.codingbat.warmup1;

public class MissingChar {
    public static String missingChar(String str, int n) {
        String startStr = str.substring(0,n);
        String endStr = str.substring(n+1);

        return startStr + endStr;
    }
}
