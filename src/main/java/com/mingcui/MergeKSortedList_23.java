package com.mingcui;

import com.mingcui.models.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList_23 {
    public ListNode mergeKLists(ListNode[] lists)
    {
        if(lists.length <= 0)
        {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if(o1.val<o2.val)
                {
                    return -1;
                }else if(o1.val == o2.val)
                {
                    return 0;
                }else
                {
                    return 1;
                }
            }
        });
        for(ListNode node:lists)
        {
            if(node != null)
            {
                queue.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!queue.isEmpty())
        {
            tail.next = queue.poll();
            tail = tail.next;
            if(tail.next != null)
            {
                queue.add(tail.next);
            }
        }
        return dummy.next;
    }
    public static void main(String[] args)
    {
        MergeKSortedList_23 list_23 = new MergeKSortedList_23();
        ListNode h1 = new ListNode(1);
        ListNode p1 = h1;
        p1.next = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode p2 = h2;
        p2.next = new ListNode(5);
        ListNode[] lists = new ListNode[2];
        lists[0] = h1;
        lists[1] = h2;
        ListNode h = list_23.mergeKLists(new ListNode[0]);
    }
}
