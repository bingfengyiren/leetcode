package com.mingcui;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar_387 {
    public int firstUniqChar(String s) {
        if(s==null) return -1;
        int freq[] = new int[52];
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A'>=26 ? s.charAt(i)-'a' + 26 : s.charAt(i)-'A';
            freq[index]++;
        }
        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'A'>=26 ? s.charAt(i)-'a' + 26 : s.charAt(i)-'A';
            if(freq[index]==1) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        FirstUniqChar_387 char_387 = new FirstUniqChar_387();
        System.out.println(char_387.firstUniqChar("leetcode"));
    }
}
