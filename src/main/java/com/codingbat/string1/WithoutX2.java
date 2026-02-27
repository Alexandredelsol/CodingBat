package com.codingbat.string1;

public class WithoutX2 {
    public static String withoutX2(String str) {
        if (str.isEmpty()) return "";
        if (str.length() > 1 &&
                str.charAt(0) == 'x' && str.charAt(1) == 'x') return str.substring(2);
        if (str.charAt(0) == 'x') return str.substring(1);
        if (str.charAt(1) == 'x') return str.substring(0,1) + str.substring(2);
        return str;
    }

}
