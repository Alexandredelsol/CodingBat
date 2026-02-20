package com.codingbat.string1;

public class ComboString {
    public static String comboString(String a, String b) {
        return b.length() < a.length() ? b + a + b : a + b + a;
    }

}
