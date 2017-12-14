package com.mingcui;

import com.mingcui.model.TreeNode;

public class ValidBST_98 {

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if(root == null) return true;
        if(root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root,minVal,root.val) && isValidBST(root,root.val,maxVal);
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public static void main(String[] args){
        ValidBST_98 bst_98 = new ValidBST_98();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        //root.left.left = new TreeNode(-1);
        System.out.println(bst_98.isValidBST(root));
    }
}
