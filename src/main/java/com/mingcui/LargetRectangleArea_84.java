package com.mingcui;

import java.util.Map;

public class LargetRectangleArea_84 {
    public static int largestRectangleArea(int[] heights) {
        int right = heights.length - 1;
        int left = 0;
        int maxArea = 0;
        while (left<right){
            maxArea = (right - left+1)* Math.min(heights[left],heights[right]);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        int[] heights = new int[]{2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
