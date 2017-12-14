package com.mingcui;

import com.mingcui.model.ListNode;

public class SwapPairs_24 {
    public ListNode swapPairs(ListNode head)
    {
        //终止条件
        if(head == null || head.next == null)
        {
            return head;
        }
        //迭代条件
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }

    public ListNode swapPairs1(ListNode head)
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null )
        {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        ListNode pos = head;
        pos.next = new ListNode(3);
        pos.next = new ListNode(5);
        pos.next = new ListNode(6);
        SwapPairs_24 pairs_24 = new SwapPairs_24();
        head = pairs_24.swapPairs1(head);
        while (head!=null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
