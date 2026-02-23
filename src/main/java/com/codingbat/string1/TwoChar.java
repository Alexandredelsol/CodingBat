package com.codingbat.string1;

public class TwoChar {
    public static String twoChar(String str, int index) {
        return (index >= str.length() - 1 || index < 0)
                ? str.substring(0, 2)
                : str.substring(index, index + 2);
    }
}
