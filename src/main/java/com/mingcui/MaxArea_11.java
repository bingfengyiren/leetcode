package com.mingcui;

/**
 * Created by mingcui on 2017/12/7.
 */
public class MaxArea_11 {
  public int maxArea(int[] height)
  {
    int maxarea = 0,l = 0,r = height.length-1;
    while (l<r)
    {
      maxarea = Math.max(maxarea,Math.min(height[l],height[r])*(r-l));
      if(height[l]<height[r])
      {
        l++;
      }else{
        r--;
      }
    }
    return maxarea;
  }

  public static void main(String[] args)
  {
    int[] height = new int[]{1,8,6,900,900,4,3,3,7};
    MaxArea_11 area_11 = new MaxArea_11();
    System.out.println(area_11.maxArea(height));
  }

}
