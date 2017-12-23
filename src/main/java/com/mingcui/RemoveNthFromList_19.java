package com.mingcui;

import com.mingcui.model.ListNode;

public class RemoveNthFromList_19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        int i = 0;
        while (i<n+1 && fast != null){
            fast=fast.next;
            i++;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        ListNode result = removeNthFromEnd(head,1);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
