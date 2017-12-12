package com.mingcui;

import com.mingcui.model.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

/**
 * Created by mingcui on 2017/12/12.
 */
public class PostOrderTraversal_145 {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
    if(root == null){
      return list;
    }
    deque.add(root);
    while (!deque.isEmpty()){
      TreeNode node = deque.pop();
      list.add(node.val);
      if(node.right != null){
        deque.add(node.right);
      }
      if(node.left != null){
        deque.add(node.left);
      }
    }
    Collections.reverse(list);
    return list;
  }
  public static void main(String[] args){
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(-3);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);

    PostOrderTraversal_145 traversal_145 = new PostOrderTraversal_145();
    List<Integer> list = traversal_145.postorderTraversal(root);
    System.out.println(Arrays.toString(list.toArray()));
  }
}
