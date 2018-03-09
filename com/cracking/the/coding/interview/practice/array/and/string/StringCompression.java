package com.cracking.the.coding.interview.practice.array.and.string;

public class StringCompression {
    public static void main (String abc[]) {
        StringCompression s = new StringCompression();
        System.out.println(s.compress("aabccccaaa"));
        System.out.println(s.compress("aabca"));

    }

    String compress(String inputStr) {
        String returnStr = "";
        char[] charArray = inputStr.toCharArray();
        char temp = 0;
        int index = 0;


        for(char c: charArray) {

            if(temp != 0 && temp != c) {
                returnStr += ""+temp+index;
                index = 0;
            }

            temp = c;
            index++;

        }
        returnStr += ""+temp+index;
        if(returnStr.length() > inputStr.length()) {
            returnStr = inputStr;
        }
        return returnStr;
    }
}
