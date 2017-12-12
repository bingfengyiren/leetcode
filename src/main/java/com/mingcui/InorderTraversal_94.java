package com.mingcui;

import com.mingcui.model.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by mingcui on 2017/12/12.
 */
public class InorderTraversal_94 {
  //递归版
  public List<Integer> inorderTraversal(TreeNode root) {
    inorderTraversal(root.left);
    System.out.println(root.val);
    inorderTraversal(root.right);
    return null;
  }
  //迭代版
  public List<Integer> inorderTraversal_1(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;
    while (cur != null || !stack.empty())
    {
      while (cur != null)
      {
        stack.add(cur);
        cur = cur.left;
      }
      cur = stack.pop();
      list.add(cur.val);
      cur = cur.right;
    }
    return list;
  }

  public static void main(String[] args){
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(-3);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    InorderTraversal_94 traversal_94 = new InorderTraversal_94();
    List<Integer> list = traversal_94.inorderTraversal_1(root);
    System.out.println(Arrays.toString(list.toArray()));
  }

}
