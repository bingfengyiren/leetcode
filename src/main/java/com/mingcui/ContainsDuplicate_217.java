package com.mingcui;

import sun.jvm.hotspot.utilities.BitMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                return true;
            }else {
                map.put(nums[i],1);
            }
        }
        return false;
    }
}


