package com.mingcui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i=0;i<nums.length-2;i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
                int lo = i+1,hi=nums.length-1,sum=0-nums[i];
                while (lo<hi){
                    if(nums[lo]+nums[hi] == sum){
                        res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] array = new int[]{-5,-1,-5,-4,2,1,-1,2,-4,-3,-2,-4};
        System.out.println(Arrays.toString(threeSum(array).toArray()));
    }
}
