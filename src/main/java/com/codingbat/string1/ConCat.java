package com.codingbat.string1;

public class ConCat {
    public static String conCat(String a, String b) {
        String first = (a.length() > 0 && b.length() > 0
                && a.charAt(a.length()-1) == b.charAt(0) )
                ? a.substring(0 , a.length() - 1)
                : a;
        return first + b;
    }

}
