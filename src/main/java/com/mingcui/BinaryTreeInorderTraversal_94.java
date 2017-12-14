package com.mingcui;

import com.mingcui.model.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (node!=null || !stack.isEmpty())
        {
            while (node!=null)
            {
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node=node.right;
        }
        return list;
    }
    public static void main(String[] args)
    {
        TreeNode node = null;
        TreeNode root = new TreeNode(1);

        node = root;
        node.right = new TreeNode(2);

        node = root.right;
        node.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
