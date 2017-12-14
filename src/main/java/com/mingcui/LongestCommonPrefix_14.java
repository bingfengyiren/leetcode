package com.mingcui;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length <= 0) return "";
        StringBuilder builder = new StringBuilder();
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        char a[] = strs[0].toCharArray();
        char b[] = strs[strs.length - 1].toCharArray();
        for(int i=0;i<a.length;i++){
            if(i<b.length && a[i] == b[i]){
                builder.append(a[i]);
            }else{
                return builder.toString();
            }
        }
        return builder.toString();
    }
    public String longestCommonPrefix_2(String[] strs) {
        if(strs == null || strs.length <= 0){
            return "";
        }
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
        public static void main(String[] args){
        String[] strs = new String[]{"acc","c","ccc"};
        LongestCommonPrefix_14 prefix_14 = new LongestCommonPrefix_14();
        System.out.println(prefix_14.longestCommonPrefix(strs));
    }
}
