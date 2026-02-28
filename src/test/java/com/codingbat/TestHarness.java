package com.codingbat;

import com.codingbat.string1.*;
import com.codingbat.warmup1.*;

public class TestHarness {
    public static void main(String[] args) {
        //warmup-1
        System.out.println("Warmup-1");
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
        System.out.println(ParrotTrouble.parrotTrouble(true, 6));
        System.out.println(ParrotTrouble.parrotTrouble(true, 7));
        System.out.println(ParrotTrouble.parrotTrouble(false, 6));
        //makes10 test
        System.out.println("makes10 tests: ");
        System.out.println(Makes10.makes10(9, 10));
        System.out.println(Makes10.makes10(9, 9));
        System.out.println(Makes10.makes10(1, 9));
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
        System.out.println(In1020.in1020(12, 99));
        System.out.println(In1020.in1020(21, 12));
        System.out.println(In1020.in1020(8, 99));
        //hasTeen test
        System.out.println("hasTeen tests");
        System.out.println(HasTeen.hasTeen(13, 20, 10));
        System.out.println(HasTeen.hasTeen(20, 19, 10));
        System.out.println(HasTeen.hasTeen(20, 10, 13));
        //loneTeen test
        System.out.println("loneTeen tests");
        System.out.println(LoneTeen.loneTeen(13, 99));
        System.out.println(LoneTeen.loneTeen(21, 19));
        System.out.println(LoneTeen.loneTeen(13, 13));
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
        System.out.println(IntMax.intMax(1, 2, 3));
        System.out.println(IntMax.intMax(1, 3, 2));
        System.out.println(IntMax.intMax(3, 2, 1));
        //close10 test
        System.out.println("close10 tests");
        System.out.println(Close10.close10(8, 13));
        System.out.println(Close10.close10(13, 8));
        System.out.println(Close10.close10(13, 7));
        //in3050 test
        System.out.println("in3050 tests");
        System.out.println(In3050.in3050(30, 31));
        System.out.println(In3050.in3050(30, 41));
        System.out.println(In3050.in3050(40, 50));
        //max1020 test
        System.out.println("max1020 tests");
        System.out.println(Max1020.max1020(11, 19));
        System.out.println(Max1020.max1020(19, 11));
        System.out.println(Max1020.max1020(11, 9));
        //stringE test
        System.out.println("stringE tests");
        System.out.println(StringE.stringE("Hello"));
        System.out.println(StringE.stringE("Heelle"));
        System.out.println(StringE.stringE("Heelele"));
        //lastDigit test
        System.out.println("lastDigit tests");
        System.out.println(LastDigit.lastDigit(7, 17));
        System.out.println(LastDigit.lastDigit(6, 17));
        System.out.println(LastDigit.lastDigit(3, 113));
        //endUp test
        System.out.println("EndUp tests");
        System.out.println(EndUp.endUp("Hello"));
        System.out.println(EndUp.endUp("hi there"));
        System.out.println(EndUp.endUp("hi"));
        //everyNth
        System.out.println("everyNth tests");
        System.out.println(EveryNth.everyNth("Miracle", 2));
        System.out.println(EveryNth.everyNth("abcdefg", 2));
        System.out.println(EveryNth.everyNth("abcdefg", 3));
        // ---------------
        //String-1
        //helloName
        System.out.println("helloName tests");
        System.out.println(HelloName.helloName("Bob"));
        System.out.println(HelloName.helloName("Alice"));
        System.out.println(HelloName.helloName("X"));
        //makeAbba
        System.out.println("makeAbba tests");
        System.out.println(MakeAbba.makeAbba("Hi", "Bye"));
        System.out.println(MakeAbba.makeAbba("Yo", "Alice"));
        System.out.println(MakeAbba.makeAbba("What", "Up"));
        //makeTags
        System.out.println("makeTags tests");
        System.out.println(MakesTags.makeTags("i", "Yay"));
        System.out.println(MakesTags.makeTags("i", "Hello"));
        System.out.println(MakesTags.makeTags("city", "Yay"));
        System.out.println("makeOutWord tests");
        System.out.println(MakeOutWord.makeOutWord("<<>>", "Yay"));
        System.out.println(MakeOutWord.makeOutWord("<<>>", "WooHoo"));
        System.out.println(MakeOutWord.makeOutWord("[[]]", "word"));
        System.out.println("extraEnd tests");
        System.out.println(ExtraEnd.extraEnd("Hello"));
        System.out.println(ExtraEnd.extraEnd("ab"));
        System.out.println(ExtraEnd.extraEnd("Hi"));
        System.out.println("firstTwo tests");
        System.out.println(FirstTwo.firstTwo("Hello"));
        System.out.println(FirstTwo.firstTwo("abcdefg"));
        System.out.println(FirstTwo.firstTwo("ab"));
        System.out.println("firstHalf tests");
        System.out.println(FirstHalf.firstHalf("WooHoo"));
        System.out.println(FirstHalf.firstHalf("HelloThere"));
        System.out.println(FirstHalf.firstHalf("abcdef"));
        System.out.println("withoutEnd tests");
        System.out.println(WithoutEnd.withoutEnd("Hello"));
        System.out.println(WithoutEnd.withoutEnd("java"));
        System.out.println(WithoutEnd.withoutEnd("coding"));
        System.out.println("comboString tests");
        System.out.println(ComboString.comboString("Hello", "hi"));
        System.out.println(ComboString.comboString("hi", "Hello"));
        System.out.println(ComboString.comboString("aaa", "b"));
        System.out.println("nonStart tests");
        System.out.println(NonStart.nonStart("Hello", "There"));
        System.out.println(NonStart.nonStart("java", "code"));
        System.out.println(NonStart.nonStart("shotl", "java"));
        System.out.println("left2 tests");
        System.out.println(Left2.left2("Hello"));
        System.out.println(Left2.left2("java"));
        System.out.println(Left2.left2("Hi"));
        System.out.println("right2 tests");
        System.out.println(Right2.right2("Hello"));
        System.out.println(Right2.right2("java"));
        System.out.println(Right2.right2("Hi"));
        System.out.println("theEnd tests");
        System.out.println(TheEnd.theEnd("Hello", true));
        System.out.println(TheEnd.theEnd("Hello", false));
        System.out.println(TheEnd.theEnd("oh", true));
        System.out.println("withouEnd2 tests");
        System.out.println(WithoutEnd2.withouEnd2("Hello"));
        System.out.println(WithoutEnd2.withouEnd2("abc"));
        System.out.println(WithoutEnd2.withouEnd2("ab"));
        System.out.println("middleTwo tests");
        System.out.println(MiddleTwo.middleTwo("string"));
        System.out.println(MiddleTwo.middleTwo("code"));
        System.out.println(MiddleTwo.middleTwo("Practice"));
        System.out.println("endsLy tests");
        System.out.println(EndsLy.endsLy("oddly"));
        System.out.println(EndsLy.endsLy("y"));
        System.out.println(EndsLy.endsLy("oddy"));
        System.out.println("nTwice tests");
        System.out.println(NTwice.nTwice("Hello", 2));
        System.out.println(NTwice.nTwice("Chocolate", 3));
        System.out.println(NTwice.nTwice("Chocolate", 1));
        System.out.println("twoChar tests");
        System.out.println(TwoChar.twoChar("java", 0));
        System.out.println(TwoChar.twoChar("java", 2));
        System.out.println(TwoChar.twoChar("java", 3));
        System.out.println("middleThree tests");
        System.out.println(MiddleThree.middleThree("Candy"));
        System.out.println(MiddleThree.middleThree("and"));
        System.out.println(MiddleThree.middleThree("solving"));
        System.out.println("hasBad tests");
        System.out.println(HasBad.hasBad("badxx"));
        System.out.println(HasBad.hasBad("xbadxx"));
        System.out.println(HasBad.hasBad("xxbadxx"));
        System.out.println("atFirst tests");
        System.out.println(AtFirst.atFirst("hello"));
        System.out.println(AtFirst.atFirst("hi"));
        System.out.println(AtFirst.atFirst("h"));
        System.out.println("lastChars tests");
        System.out.println(LastChars.lastChars("last", "chars"));
        System.out.println(LastChars.lastChars("yo", "java"));
        System.out.println(LastChars.lastChars("hi", ""));
        System.out.println("conCat tests");
        System.out.println(ConCat.conCat("avc", "cat"));
        System.out.println(ConCat.conCat("dog", "cat"));
        System.out.println(ConCat.conCat("abc", ""));
        System.out.println("lastTwo tests");
        System.out.println(LastTwo.lastTwo("coding"));
        System.out.println(LastTwo.lastTwo("cat"));
        System.out.println(LastTwo.lastTwo("ab"));
        System.out.println("SeeColor tests");
        System.out.println(SeeColor.seeColor("redxx"));
        System.out.println(SeeColor.seeColor("xxred"));
        System.out.println(SeeColor.seeColor("blueTimes"));
        System.out.println("frontAgain tests");
        System.out.println(FrontAgain.frontAgain("edited"));
        System.out.println(FrontAgain.frontAgain("edit"));
        System.out.println(FrontAgain.frontAgain("ed"));
        System.out.println("minCat tests");
        System.out.println(MinCat.minCat("Hello", "Hi"));
        System.out.println(MinCat.minCat("Hello", "java"));
        System.out.println(MinCat.minCat("java", "Hello"));
        System.out.println("extraFront tests");
        System.out.println(ExtraFront.extraFront("HeHeHe"));
        System.out.println(ExtraFront.extraFront("ab"));
        System.out.println(ExtraFront.extraFront("H"));
        System.out.println("without2 tests");
        System.out.println(Without2.without2("HelloHe"));
        System.out.println(Without2.without2("HelloHi"));
        System.out.println(Without2.without2("Hi"));
        System.out.println("deFront tests");
        System.out.println(DeFront.deFront("Hello"));
        System.out.println(DeFront.deFront("java"));
        System.out.println(DeFront.deFront("away"));
        System.out.println("startWord tests");
        System.out.println(StartWord.startWord("hippo", "hi"));
        System.out.println(StartWord.startWord("hippo", "xip"));
        System.out.println(StartWord.startWord("hippo", "i"));
        System.out.println("withoutX tests");
        System.out.println(WithoutX.withoutX("xHix"));
        System.out.println(WithoutX.withoutX("xHi"));
        System.out.println(WithoutX.withoutX("Hxix"));
        System.out.println("withoutX2 tests");
        System.out.println(WithoutX2.withoutX2("xHi"));
        System.out.println(WithoutX2.withoutX2("Hxi"));
        System.out.println(WithoutX2.withoutX2("Hi"));
        // ----
        // Logic-1
        System.out.println("cigarParty tests");
        System.out.println();
        /*cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true*/
        System.out.println("dateFashion tests");
        /*dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
Go*/
        System.out.println("squirrelPlay tests");
        /*squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true*/
        System.out.println("caughtSpeeding tests");
        /*caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0
*/
        System.out.println("SortaSum tests");
        /*sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21*/
    }
}
