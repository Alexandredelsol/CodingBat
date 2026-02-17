package com.codingbat.warmup1;

public class Front3 {
    public static String front3(String str) {
        int strLength = str.length();

        if (strLength <= 3) return str+str+str;
        String front = str.substring(0,3);

        return front+front+front;
    }
}
