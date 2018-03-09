package com.cracking.the.coding.interview.practice.array.and.string;

public class UniqueChar {
    public static void main(String abc[]) {
        UniqueChar a = new UniqueChar();
        System.out.println(a.isUnique("hello"));
        System.out.println(a.isUnique("side"));
        System.out.println(a.isUnique("abcdehjklfyuiop"));
        System.out.println(a.isUnique("abcdehjklfyuiopf"));
    }

    boolean isUnique(String input) {
        boolean isUnique = true;
        char[] charArray = input.toCharArray();
        StringBuffer appendString = new StringBuffer();
        appendString.append(charArray[0]);
        for(int i = 1; i < charArray.length; i ++) {
            if(appendString.toString().contains(""+charArray[i])) {
                isUnique = false;
                return isUnique;
            }
            appendString.append(charArray[i]);
        }
        return isUnique;
    }
}
