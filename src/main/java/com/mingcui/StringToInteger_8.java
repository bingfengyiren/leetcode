package com.mingcui;

/**
 * Created by mingcui on 2017/12/5.
 */
public class StringToInteger_8 {
  public int myAtoi(String str) {
    int index = 0,sign=1,result=0;
    //1.Empty String
    if(str.length()==0)
    {
      return 0;
    }
    //2.Remove space head and end
    while(str.charAt(index) == ' ' && index<str.length()) index++;

    //3.sign
    if(str.charAt(index)=='+' || str.charAt(index)=='-')
    {
      sign = str.charAt(index) == '+' ? 1 : -1;
      index++;
    }

    //4.convert
    while (index<str.length())
    {
      int digit = str.charAt(index) - '0';
      if(digit <0 || digit >9) break;

      //if overflow
      if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10<digit )
      {
        return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
      }
      result = result*10 + digit;
      index++;
    }
    return result*sign;
  }
  public static void main(String[] args)
  {
    StringToInteger_8 integer_8 = new StringToInteger_8();
    String str = String.valueOf("90 ");
    System.out.println(str);
    System.out.println(integer_8.myAtoi(str));
  }
}
