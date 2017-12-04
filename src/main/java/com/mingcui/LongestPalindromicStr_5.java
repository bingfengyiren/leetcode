package com.mingcui;

/**
 * Created by mingcui on 2017/12/3.
 */
public class LongestPalindromicStr_5 {
  public static void main(String[] args)
  {
    String s = "abbac";
    LongestPalindromicStr_5 str_5 = new LongestPalindromicStr_5();
    System.out.println(str_5.longestPalindrome(s));
  }
//  public static String longestPalindrome(String s) {
//    int start = 0, end = 0;
//    for (int i = 0; i < s.length(); i++) {
//      int len1 = expandAroundCenter(s, i, i);
//      int len2 = expandAroundCenter(s, i, i + 1);
//      int len = Math.max(len1, len2);
//      if (len > end - start) {
//        start = i - (len - 1) / 2;
//        end = i + len / 2;
//      }
//    }
//    return s.substring(start, end + 1);
//  }
//
//  private static int expandAroundCenter(String s,int left,int right)
//  {
//    int L = left,R = right;
//    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//      L--;
//      R++;
//    }
//    return R - L - 1;
//  }
  public String longestPalindrome(String s)
  {
    int start=0,end=0;
    for(int i=0;i<s.length()-1;i++)
    {
      int len1 = expandAroundCenter(s,i,i);
      int len2 = expandAroundCenter(s,i,i+1);
      int len = Math.max(len1,len2);
      if(len>end-start)
      {
        start = i-(len-1)/2;
        end = i+len/2;
      }
    }
    return s.substring(start,end+1);
  }
  private int expandAroundCenter(String s,int left,int right)
  {
    while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
    {
      left--;
      right++;
    }
    return right-left-1;
  }
}
