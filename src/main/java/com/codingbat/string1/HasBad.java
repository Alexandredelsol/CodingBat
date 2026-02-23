package com.codingbat.string1;

public class HasBad {
    public static boolean hasBad(String str) {
        return (str.length() >= 3 && str.substring(0, 3).equals("bad"))
                || (str.length() >= 4 && str.substring(1, 4).equals("bad"));
    }
}
