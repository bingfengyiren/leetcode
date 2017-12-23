package com.mingcui;

public class Strstr_28 {
    public static int strStr(String haystack, String needle) {
        int hlength = haystack.length();
        int nlength = needle.length();
        for(int i=0;i<hlength-nlength;i++){
            int j;
            for (j=0;j<nlength;j++){
                if(haystack.charAt(i+j) != needle.charAt(j)) break;
            }
            if(j==nlength) return i;
            if(i+j==hlength) return -1;
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(strStr("hello","ll"));
    }
}
