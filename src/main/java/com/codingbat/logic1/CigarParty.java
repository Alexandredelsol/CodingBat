package com.codingbat.logic1;

public class CigarParty {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
    }
}
