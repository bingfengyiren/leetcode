package com.mingcui;

import com.mingcui.model.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by mingcui on 2017/12/12.
 */
public class PreOrderTraversal_144 {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<Integer>();
    Stack<TreeNode> rights = new Stack<TreeNode>();
    TreeNode cur = root;
    while (cur != null ){
      list.add(cur.val);
      if(cur.right != null)
      {
        rights.push(cur.right);
      }
      cur = cur.left;
      if(cur == null && !rights.empty())
      {
        cur = rights.pop();
      }
    }
    return list;
  }

}
