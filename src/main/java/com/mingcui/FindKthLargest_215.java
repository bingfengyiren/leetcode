package com.mingcui;

public class FindKthLargest_215 {
    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums,0,nums.length-1,k-1);
    }
    private int findKthLargest(int[] nums, int start,int end,int k){
        int low = start;
        int high = end;
        int pivot = nums[start];
        while (low<high){
            while (low<high && nums[high--]<=pivot);
            nums[low] = nums[high];
            while (low<high && nums[low++]>=pivot);
            nums[high]=nums[low];
        }
        if(low>k){
            findKthLargest(nums,start,low - 1,k);
        }else if(low<k){
            findKthLargest(nums,low+1,end,k);
        }
        return nums[k];
    }
}
