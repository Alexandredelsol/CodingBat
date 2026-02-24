package com.codingbat.string1;

public class AtFirst {
    public static String atFirst(String str) {
        return str.length() >= 2
                ? str.substring(0, 2)
                : str.length() == 1 ? str + "@" : "@@";
    }

}
