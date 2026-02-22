package com.codingbat.string1;

public class WithoutEnd2 {
    public static String withouEnd2(String str) {
        return (str.length() > 1 ) ? str.substring( 1 , str.length() - 1 ) : "";
    }
}
