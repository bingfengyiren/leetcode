package com.mingcui;

import com.mingcui.model.TreeNode;
import java.util.Stack;

/**
 * Created by mingcui on 2017/12/11.
 */
public class SymmetricTree_101 {
  public boolean isSymmetricRecur(TreeNode root)
  {
    if(root == null) return true;
    return isSymmetricRecurHelp(root.left,root.right);
  }
  private boolean isSymmetricRecurHelp(TreeNode left,TreeNode right)
  {
    if(left == null || right == null) {
      return left == right;
    }
    if(left.val != right.val)
    {
      return false;
    }
    return isSymmetricRecurHelp(left.left,right.right) && isSymmetricRecurHelp(left.right,right.left);
  }

  public boolean isSymmetric(TreeNode root)
  {
    if(root == null) return true;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode left,right;
    if(root.left != null)
    {
      if(root.right == null) return false;
      stack.push(root.left);
      stack.push(root.right);
    }else if(root.right != null)
    {
      return false;
    }
    while (!stack.empty()){
      if(stack.size()%2 != 0) return false;
      left = stack.pop();
      right = stack.pop();
      if(right.val!=left.val) return false;

      if(left.left!=null){
        if(right.right==null) return false;
        stack.push(left.left);
        stack.push(right.right);
      }else if(right.right!=null)
      {
        return false;
      }

      if(left.right!=null)
      {
        if(right.left==null) return false;
        stack.push(left.right);
        stack.push(right.left);
      }else if(right.left!=null)
      {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args)
  {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(3);
    root1.right = new TreeNode(3);
    root1.left.left = new TreeNode(10);
    root1.right.right = new TreeNode(10);
    SymmetricTree_101 tree_101 = new SymmetricTree_101();
    System.out.println(tree_101.isSymmetric(root1));
  }
}
