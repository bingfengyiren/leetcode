package com.mingcui;

import com.mingcui.model.ListNode;
import com.mingcui.model.ListUtils;

public class OddEvenLinkedList_328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = head,even = head.next,evenHead = even;
        while (even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5};
        ListNode head = ListUtils.createList(nums);
        ListNode result = oddEvenList(head);
        ListUtils.printList(result);
    }
}
