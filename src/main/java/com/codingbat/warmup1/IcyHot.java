package com.codingbat.warmup1;

public class IcyHot {
    public static boolean icyHot(int temp1, int temp2) {
        boolean hasFreezingTemp = temp1 < 0 || temp2 < 0;
        boolean hasBoilingTemp = temp1 > 100 || temp2 > 100;
        return hasFreezingTemp && hasBoilingTemp;
    }
}
