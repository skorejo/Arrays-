/*
package com.cracking.the.coding.interview.practice.array.and.string;

import java.net.URLEncoder;

public class URLify {
    public static void main(String abc[]) {
        URLify urLify = new URLify();
        System.out.println(urLify.replaceURL("Mr John  "));
    }

    String replaceURL(String str) {
        str = str.replaceAll(" ", "%20");
        return str;
    }

    String replaceURL2(String str) {
        //URLEncoder.encode(str, "UTF-8").replace(" ", "%20");
        char[] charArray = str.toCharArray();
        for(char c: charArray) {
            if(c == ' ') {

            }
        }
        return str;
    }
}
*/
