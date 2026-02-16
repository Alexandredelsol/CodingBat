package com.codingbat.warmup1;

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        boolean forbiddenHours = hour < 7 || hour > 20;
        return talking && forbiddenHours;
    }
}
