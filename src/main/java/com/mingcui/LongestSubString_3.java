package com.mingcui;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mingcui on 2017/12/2.
 */
public class LongestSubString_3 {
  public static int lengthOfLongestSubstring(String s) {
    if(s.length()==0) return 0;
    int max = 0;
    Map<Character,Integer> map = new HashMap<Character, Integer>();
    for(int i=0,j=0;i<s.length();++i)
    {
      if(map.containsKey(s.charAt(i)))
      {
        j = Math.max(j,map.get(s.charAt(i)) + 1);
      }
      map.put(s.charAt(i),i);
      max = Math.max(max,i-j+1);
    }
    return max;
  }

  public static void main(String[] args)
  {
    String s = "abba";
    System.out.println(lengthOfLongestSubstring(s));
  }
}
