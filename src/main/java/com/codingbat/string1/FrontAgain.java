package com.codingbat.string1;

public class FrontAgain {
    public static boolean frontAgain(String str) {
        int stringLength = str.length();
        if (stringLength < 2) return false;
        return str.charAt(0) == str.charAt(str.length()-2)
                && str.charAt(1) == str.charAt(str.length() - 1);
    }

}
