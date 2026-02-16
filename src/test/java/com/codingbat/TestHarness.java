package com.codingbat;

import com.codingbat.warmup1.MonkeyTrouble;
import com.codingbat.warmup1.SleepIn;
import com.codingbat.warmup1.SumDouble;

public class TestHarness {
    public static void main(String[] args) {
        //sleepIn test
        System.out.println("sleepIn tests: ");
        System.out.println(SleepIn.sleepIn(false, false));
        System.out.println(SleepIn.sleepIn(true, false));
        System.out.println(SleepIn.sleepIn(false, true));
        System.out.println(SleepIn.sleepIn(false, false));
        //monkeyTrouble test
        System.out.println("monkeyTrouble tests: ");
        System.out.println(MonkeyTrouble.monkeyTrouble(true, true));
        System.out.println(MonkeyTrouble.monkeyTrouble(false, false));
        System.out.println(MonkeyTrouble.monkeyTrouble(true, false));
        System.out.println(MonkeyTrouble.monkeyTrouble(false, true));
        //sumDouble test
        System.out.println("sumDouble tests: ");
        System.out.println(SumDouble.sumDouble(1, 2));
        System.out.println(SumDouble.sumDouble(3, 2));
        System.out.println(SumDouble.sumDouble(2, 2));
        System.out.println(SumDouble.sumDouble(-1, 0));
    }
}
