package com.mingcui;

import com.sun.org.apache.regexp.internal.RE;

public class ReverseString_344 {
    public String reverseString(String s) {
        int length = s.length();
        char[] charArray = s.toCharArray();
        for(int i=0;i<length/2;i++){
            int left = i;
            int right = length - i - 1;
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
        }
        return String.valueOf(charArray);
    }
    public static void main(String[] args){
        ReverseString_344 string_344 = new ReverseString_344();
        System.out.println(string_344.reverseString("hello"));
    }
}
