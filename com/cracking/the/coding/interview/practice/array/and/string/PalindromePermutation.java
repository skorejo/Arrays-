package com.cracking.the.coding.interview.practice.array.and.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class PalindromePermutation {
    public static void main(String abc[]) {
        PalindromePermutation p = new PalindromePermutation();
        System.out.println(p.isPermutationOfPalindrome("Tact Coa"));
    }

    boolean isPermutationOfPalindrome(String str) {
        boolean isPermOfPalindrome = false;
        HashMap<Character, Integer> hashMap = fillHashMap(str);
        Collection<Integer> values = hashMap.values();
        int[] array = values.stream().mapToInt(i->i).toArray();
        if( values.contains(1) && Arrays.stream(array).distinct().count() == 2) {
           isPermOfPalindrome = true;
           return isPermOfPalindrome;
        }
        return isPermOfPalindrome;
    }

    HashMap<Character, Integer> fillHashMap(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        Integer value;
        for(char c: charArray) {
            if(hashMap.containsKey(c))
            {
                value = hashMap.get(c);
                value++;
            }
            else
            {
                value = 1;
            }
            hashMap.put(c, value);
        }

        return hashMap;
    }
}
