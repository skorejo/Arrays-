package com.cracking.the.coding.interview.practice.array.and.string;

public class OneAway {
    public static void main(String abc[]) {

        OneAway o = new OneAway();
        System.out.println(o.isOneAway("pale", "ple"));
        System.out.println(o.isOneAway("pales", "pale"));
        System.out.println(o.isOneAway("pale", "bale"));
        System.out.println(o.isOneAway("pale", "bake"));

    }

    boolean isOneAway(String str1, String str2) {
        boolean isOneAwayFlag = false;
        char[] charArray1 = str1.toCharArray();

        if(str1.length() == str2.length())
        {
            // this is the case of edit
        }
        else
            if(str1.length() == str2.length() - 1)
        {
            // this is the case of insert
            charArray1 = str2.toCharArray();
        }
        else if(str1.length() -1 == str2.length()) {
            // this is the case of delete

            }
            else
            {
                // this is invalid case therefore return false
                return isOneAwayFlag;
            }

            // check for uniqueness too:

        if( isUnique(str1) && isUnique(str2) ) {

            for (char c : charArray1) {
                String characterStr = c + "";
                if (str2.contains(characterStr)) {
                    str2 = str2.replace(characterStr, "");
                    str1 = str1.replace(characterStr, "");
                } else {
                    if(isOneAwayFlag == true) {
                        isOneAwayFlag = false;
                        return isOneAwayFlag;
                    }
                    else {
                        isOneAwayFlag = true;
                    }
                }
            }
        }
        else
        {
            return isOneAwayFlag;
        }
        return isOneAwayFlag;
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
