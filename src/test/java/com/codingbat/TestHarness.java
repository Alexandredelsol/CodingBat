package com.codingbat;

import com.codingbat.warmup1.*;

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
        //diff21 test
        System.out.println("diff21 tests: ");
        System.out.println(Diff21.diff21(19));
        System.out.println(Diff21.diff21(10));
        System.out.println(Diff21.diff21(21));
        //parrotTrouble test
        System.out.println("parrotTrouble tests: ");
        System.out.println(ParrotTrouble.parrotTrouble(true,6));
        System.out.println(ParrotTrouble.parrotTrouble(true,7));
        System.out.println(ParrotTrouble.parrotTrouble(false,6));
        //makes10 test
        System.out.println("makes10 tests: ");
        System.out.println(Makes10.makes10(9,10));
        System.out.println(Makes10.makes10(9,9));
        System.out.println(Makes10.makes10(1,9));
        //nearHundred test
        System.out.println("nearHundred tests: ");
        System.out.println(NearHundred.nearHundred(93));
        System.out.println(NearHundred.nearHundred(90));
        System.out.println(NearHundred.nearHundred(89));
        //posNeg test
        System.out.println("posNeg tests: ");
        System.out.println(PosNeg.posNeg(1, -1, false));
        System.out.println(PosNeg.posNeg(-1, 1, false));
        System.out.println(PosNeg.posNeg(-4, -5, true));
        //notString test
        System.out.println("notString tests: ");
        System.out.println(NotString.notString("candy"));
        System.out.println(NotString.notString("x"));
        System.out.println(NotString.notString("not bad"));
        //missingChar test
        System.out.println("missing char tests: ");
        System.out.println(MissingChar.missingChar("kitten", 1));
        System.out.println(MissingChar.missingChar("kitten", 0));
        System.out.println(MissingChar.missingChar("kitten", 4));
        //frontBack test
        System.out.println("frontBack tests: ");
        System.out.println(FrontBack.frontBack("code"));
        System.out.println(FrontBack.frontBack("a"));
        System.out.println(FrontBack.frontBack("ab"));
        //front3 test
        System.out.println("front3 tests: ");
        System.out.println(Front3.front3("Java"));
        System.out.println(Front3.front3("Chocolate"));
        System.out.println(Front3.front3("abc"));
        //backAround test
        System.out.println("backAround tests");
        System.out.println(BackAround.backAround("cat"));
        System.out.println(BackAround.backAround("Hello"));
        System.out.println(BackAround.backAround("a"));
        //or35 test
        System.out.println("or35 tests");
        System.out.println(Or35.or35(3));
        System.out.println(Or35.or35(10));
        System.out.println(Or35.or35(8));
        //front22 test
        System.out.println("front22 tests");
        System.out.println(Front22.front22("kitten"));
        System.out.println(Front22.front22("Ha"));
        System.out.println(Front22.front22("abc"));
        //startHi test
        System.out.println("startHi tests");
        System.out.println(StartHi.startHi("hi there"));
        System.out.println(StartHi.startHi("hi"));
        System.out.println(StartHi.startHi("hello hi"));
        //icyHot test
        System.out.println("icyHot tests");
        System.out.println(IcyHot.icyHot(120, -1));
        System.out.println(IcyHot.icyHot(-1, 120));
        System.out.println(IcyHot.icyHot(2, 120));
        //in1020 test
        System.out.println("in1020 tests");
        System.out.println(In1020.in1020(12,99));
        System.out.println(In1020.in1020(21,12));
        System.out.println(In1020.in1020(8,99));
        //hasTeen test
        System.out.println("hasTeen tests");
        System.out.println(HasTeen.hasTeen(13,20,10));
        System.out.println(HasTeen.hasTeen(20,19,10));
        System.out.println(HasTeen.hasTeen(20,10,13));
        //loneTeen test
        System.out.println("loneTeen tests");
        System.out.println(LoneTeen.loneTeen(13,99));
        System.out.println(LoneTeen.loneTeen(21,19));
        System.out.println(LoneTeen.loneTeen(13,13));
        //delDel test
        System.out.println("delDel tests");
        System.out.println(DelDel.delDel("adelbc"));
        System.out.println(DelDel.delDel("adelHello"));
        System.out.println(DelDel.delDel("adedbc"));
        //mixStart test
        System.out.println("mixStart tests");
        System.out.println(MixStart.mixStart("mix snacks"));
        System.out.println(MixStart.mixStart("pix snacks"));
        System.out.println(MixStart.mixStart("piz snacks"));
        //startOz test
        System.out.println("startOz tests");
        System.out.println(StartOz.startOz("ozymandias"));
        System.out.println(StartOz.startOz("bzoo"));
        System.out.println(StartOz.startOz("oxx"));
        //intMax test
        System.out.println("intMax tests");
        System.out.println(IntMax.intMax(1,2,3));
        System.out.println(IntMax.intMax(1,3,2));
        System.out.println(IntMax.intMax(3,2,1));
        //close10 test
        System.out.println("close10 tests");
        System.out.println(Close10.close10(8,13));
        System.out.println(Close10.close10(13,8));
        System.out.println(Close10.close10(13,7));
    }
}
