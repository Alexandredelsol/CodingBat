package com.codingbat.logic1;

public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicketLimit = isBirthday ? 65 : 60;
        int smallTicketLimit = isBirthday ? 85 : 80;

        if (speed <= noTicketLimit) return 0;
        if (speed <= smallTicketLimit) return 1;

        return 2;
    }
}
