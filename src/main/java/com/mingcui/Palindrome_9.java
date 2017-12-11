package com.mingcui;

/**
 * Created by mingcui on 2017/12/7.
 */
public class Palindrome_9 {
  public Boolean IsPalindrome(int x){
    if(x < 0 || (x%10==0 && x!=0))
    {
      return false;
    }
    int revertNumber = 0;
    while (x > revertNumber)
    {
      revertNumber = revertNumber*10 + x%10;
      x /= 10;
    }
    return x == revertNumber || x == revertNumber/10;
  }

  public static void main(String[] args)
  {
    Palindrome_9 palindrome_9 = new Palindrome_9();
    System.out.println(palindrome_9.IsPalindrome(1));
  }
}
