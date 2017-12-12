package com.mingcui;

import com.mingcui.model.TreeNode;

/**
 * Created by mingcui on 2017/12/11.
 */
public class SameTree_100 {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val) {
      boolean sameLeft = isSameTree(p.left, q.left);
      boolean sameRight = isSameTree(p.right, q.right);
      return sameLeft && sameRight;
    }
    return false;
  }
  public static void main(String[] args)
  {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(3);
    root1.right = new TreeNode(4);
    TreeNode root2 = new TreeNode(0);
    root2.left = new TreeNode(3);
    root2.right = new TreeNode(4);
    SameTree_100 tree_100 = new SameTree_100();
    System.out.println(tree_100.isSameTree(root1,root2));
  }
}
