package com.codingbat.string1;

public class WithoutX {
    public static String withoutX(String str) {
        int start = 0;
        int end = str.length();

        if (!str.isEmpty() && str.charAt(0) == 'x') start = 1;
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') end -= 1;

        if (start > end) return "";

        return str.substring(start, end);
    }
}
