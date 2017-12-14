package com.mingcui;

import com.mingcui.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxPathSum_124 {
//    public int maxPathSum(TreeNode root) {
//
//    }
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);
        System.out.println(deque.poll());
        System.out.println(deque.poll());
    }
}
