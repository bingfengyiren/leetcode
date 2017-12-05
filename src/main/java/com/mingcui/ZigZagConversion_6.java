package com.mingcui;

/**
 * Created by mingcui on 2017/12/4.
 */
public class ZigZagConversion_6 {
  public static void main(String[] args)
  {
    ZigZagConversion_6 conversion_6 = new ZigZagConversion_6();
    String str = conversion_6.convert("PAYPALISHIRING",3);
    System.out.println(str);
  }
  public String convert(String s, int nRows) {
    char[] c = s.toCharArray();
    StringBuilder[] builder = new StringBuilder[nRows];
    for (int i=0;i<nRows;i++) {
      builder[i] = new StringBuilder();
    }
    int i=0;
    while (i<c.length) {
      for(int idx=0;idx<nRows && i<c.length;idx++) {
        builder[idx].append(c[i++]);
      }
      for (int idx=nRows-2;idx>=1 && i<c.length;idx--)
      {
        builder[idx].append(c[i++]);
      }
    }
    for(int idx=1;idx<nRows;idx++)
    {
      builder[0].append(builder[idx].toString());
    }
    return builder[0].toString();
  }
}
