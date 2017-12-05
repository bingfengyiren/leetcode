package com.mingcui;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by mingcui on 2017/12/5.
 */
public class ReverseInteger_7 {
  public static void main(String[] args)
  {
    ReverseInteger_7 integer_7 = new ReverseInteger_7();
    System.out.println(integer_7.reverse(1534236469));
  }

  public int reverse(int x)
  {
    int result = 0;
    while(x != 0)
    {
      int tail = x%10;
      int newResult = result*10 + tail;
      if((newResult - result)/10 != 0)
      {
        return 0;
      }
      result = newResult;
      x /= 10;
    }
    return result;
  }
}
