package com.codingbat.warmup1;

public class In3050 {
    private static boolean inRange(int nbr1, int nbr2 , int min, int max){
        return (nbr1 >= min && nbr1 <= max) && (nbr2 >= min && nbr2 <= max);
    }

    public static boolean in3050(int a, int b) {
        return inRange(a,b,30,40) || inRange(a,b,40,50) ;
    }

}
