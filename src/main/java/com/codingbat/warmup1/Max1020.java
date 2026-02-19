package com.codingbat.warmup1;

public class Max1020 {
    private static boolean inRange10to20(int nbr1){
        return nbr1 >=10 && nbr1 <=20;
    }
    public static int max1020(int a, int b) {
        boolean inA = inRange10to20(a);
        boolean inB = inRange10to20(b);

        if (inA && inB) return Math.max(a,b);
        if (inA) return a;
        if (inB) return b;
        return 0;
    }
}
