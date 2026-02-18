package com.codingbat.warmup1;

public class StartOz {
    public static String startOz(String str) {

        StringBuilder result = new StringBuilder(2);

        if (str.startsWith("o")) result.append("o");
        if (str.length() > 1 && str.charAt(1) == 'z') result.append("z");

        return result.toString();

    }
}
