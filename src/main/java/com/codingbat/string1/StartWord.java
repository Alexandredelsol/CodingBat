package com.codingbat.string1;

public class StartWord {
    public static String startWord(String str, String word) {
        int wordLength = word.length();

        if (str.length() < wordLength) return "";

        String partStr = str.substring(1, wordLength);
        String partWord = word.substring(1);

        return (partStr.equals(partWord)) ? str.substring(0,wordLength) : "" ;
    }
}
