package com.codingbat.logic1;

public class InOrder {
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean bGreater = b > a;
        boolean cGreater = c > b;

        return bOk ? cGreater : bGreater && cGreater;
    }
}
