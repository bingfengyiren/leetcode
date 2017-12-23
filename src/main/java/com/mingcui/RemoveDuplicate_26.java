package com.mingcui;

public class RemoveDuplicate_26 {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length<2) return length;
        int id = 1;
        for(int i =1;i<length;i++){
            if(nums[i] != nums[i-1]) nums[id++]=nums[i];
        }
        return id;
    }

}
