package com.mingcui.model;

public class ListUtils {
    public static ListNode createList(int[] nums){
        ListNode head = new ListNode(0);
        ListNode pos = head;
        for (int num:nums){
            pos.next = new ListNode(num);
            pos = pos.next;
        }
        return head.next;
    }

    public static void printList(ListNode head){
        ListNode pos = head;
        String result = "";
        while (pos != null){
            if(pos.next!= null){
                result +=pos.val+"->";
            }else
            {
                result += pos.val;
            }
            pos = pos.next;
        }
        System.out.println(result);
    }

    public static void deleteNode(ListNode node){
        node.val =  node.next.val;
        node.next = node.next.next;
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next==null) return head;
        ListNode pre = null;
        ListNode next = head;
        while (next!=null){
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
        }
        return pre;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a!=b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
