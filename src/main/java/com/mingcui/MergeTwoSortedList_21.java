package com.mingcui;

import com.mingcui.model.ListNode;

public class MergeTwoSortedList_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode mergeHead;
        if(l1.val < l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        }
        else{
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2){
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (l1 != null && l2!=null)
        {
            if(l1.val < l2.val)
            {
                prev.next = l1;
                l1 = l1.next;
            }else
            {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2: l1;
        return preHead.next;
    }
    public static void main(String[] args)
    {
        MergeTwoSortedList_21 list_21 = new MergeTwoSortedList_21();
        ListNode h1 = new ListNode(1);
        ListNode p1 = h1;
        p1.next = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode p2 = h2;
        p2.next = new ListNode(5);
        ListNode h = list_21.mergeTwoLists1(h1,h2);
        while (h!=null){
            System.out.println(h.val);
            h = h.next;
        }
    }
}
