package com.codingbat.string1;

public class LastTwo {
    public static String lastTwo(String str) {
        int stringLength = str.length();
        return (stringLength >= 2)
                ? str.substring(0, stringLength - 2)
                + str.charAt(stringLength - 1)
                + str.charAt(stringLength - 2)
                : str;
    }

}
