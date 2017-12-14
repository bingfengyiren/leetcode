package com.mingcui;

import com.mingcui.model.TreeNode;

public class SortedArrayToBST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = helper(nums,0,nums.length - 1);
        return root;
    }
    private TreeNode helper(int nums[],int start,int end){
        if(start > end) return null;
        int mid = (end + start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,start,mid -1);
        node.right = helper(nums,mid+1,end);
        return node;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        SortedArrayToBST_108 bst_108 = new SortedArrayToBST_108();
        bst_108.sortedArrayToBST(nums);
    }
}
