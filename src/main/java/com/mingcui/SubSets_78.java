package com.mingcui;

import com.mingcui.model.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<Integer>(),nums,0);
        return list;
    }

    public void backtrack(List<List<Integer>> list,List<Integer> templist,int[] nums,int start){
        list.add(new ArrayList<Integer>(templist));
        for(int i=start;i<nums.length;i++){
            templist.add(nums[i]);
            backtrack(list,templist,nums,i+1);
            //templist.remove(templist.size()-1);
        }
    }

    public static void main(String[] args){
        SubSets_78 subSets_78 = new SubSets_78();
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = subSets_78.subsets(nums);
        System.out.println(result);
    }
}
