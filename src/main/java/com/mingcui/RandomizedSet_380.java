package com.mingcui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet_380 {
    ArrayList<Integer> nums;
    HashMap<Integer,Integer> locs;
    public RandomizedSet_380(){
        nums = new ArrayList<>();
        locs = new HashMap<>();
    }

    public boolean insert(int val) {
        boolean contain = locs.containsKey(val);
        if(contain) return false;
        locs.put(val,nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val){
       boolean contain = locs.containsKey(val);
       if(!contain) return false;
       int loc = locs.get(val);
       if(loc<nums.size()-1){
           int lastone = nums.get(nums.size() - 1);
           nums.set(loc,lastone);
           locs.put(lastone,loc);
       }
       locs.remove(val);
       nums.remove(nums.size() - 1);
       return true;
    }

//    public int getRandom(){
//        return nums.get(R)
//    }
}
