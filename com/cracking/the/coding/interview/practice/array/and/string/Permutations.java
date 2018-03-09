package com.cracking.the.coding.interview.practice.array.and.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutations {
    public static void main(String abc[]) {
        Permutations p = new Permutations();
        System.out.println(p.isPermutation("ABC", "BCA"));
        System.out.println(p.isPermutation("ABC", "BDA"));

    }

    boolean isPermutation(String str1, String str2) {
        boolean isPerm = false;
        str1 = sort(str1);
        str2 = sort(str2);
        if(str1.equalsIgnoreCase(str2)) {
            isPerm = true;
            return isPerm;
        }
        return isPerm;
    }

    public String sort (String str)
    {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}


