package com.mingcui;

import com.mingcui.model.ListNode;
import com.mingcui.model.ListUtils;

public class IsPalindromeList_234 {
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

    public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next =reverseList(slow.next);
        slow = slow.next;
        while (slow != null){
            if(slow.val != head.val) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,2,1};
        ListNode head = ListUtils.createList(nums);
        System.out.println(isPalindrome(head));
    }
}
