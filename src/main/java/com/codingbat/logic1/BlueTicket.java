package com.codingbat.logic1;

public class BlueTicket {
    private static boolean sumTen(int num1,int num2){
        return num1 + num2 == 10;
    }
    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if(sumTen(a, b)  || sumTen(b, c) || sumTen(a, c)) return 10;
        if(ab == bc + 10 || ab == ac + 10) return 5;
        return 0;
    }

}
