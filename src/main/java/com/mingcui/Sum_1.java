package com.mingcui;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mingcui on 2017/11/27.
 */
public class Sum_1 {
  public static int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer,Integer> map = new HashMap<Integer, Integer>();
    for (int i=0;i<nums.length;i++)
    {
      int num = nums[i];
      if(map.containsKey(target - num))
      {
        result[0] = i;
        result[1] = map.get(target - num);
        return result;
      }
      map.put(num,i);
    }
    return result;
  }
  public static void main(String[] args)
  {
    int[] nums = new int[]{2, 7, 11, 15};
    System.out.println(Arrays.toString(twoSum(nums,26)));
  }
}
