package com.cracking.the.coding.interview.practice.array.and.string;

public class StringRotation {
    public static void main(String abc[]) {
        StringRotation s = new StringRotation();
        System.out.println(s.isStringRotation("waterbottle", "erbottlewat"));
        System.out.println(s.isStringRotation("waterbottle", "erbottlewad"));

    }

    boolean isStringRotation(String str1, String str2) {
        boolean isRotation = false;

        StringBuffer concatenatedStr = new StringBuffer(str2).append(str2);
        if(isSubString(concatenatedStr.toString(), str1) && concatenatedStr.toString().length() == str1.length()*2)
        {
            isRotation = true;
        }
        return isRotation;
    }

    boolean isSubString(String str1, String str2) {
        if(str1.toString().contains(str2)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
