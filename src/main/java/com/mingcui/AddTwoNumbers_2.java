package com.mingcui;

import java.util.List;

/**
 * Created by mingcui on 2017/11/27.
 */
public class AddTwoNumbers_2 {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = null;
    ListNode num1 = l1;
    ListNode num2 = l2;
    ListNode s = null;
    int gt = 0;
    while (num1 != null || num2!= null)
    {
      int sum = 0;
      if(num2 == null && num1 != null) {
        sum = num1.val;
      }else if(num1 == null && num2 != null)
      {
        sum = num2.val;
      }else {
        sum = num1.val+num2.val;
      }
      sum = gt == 1 ? ++sum : sum;
      ListNode node = null;
      if(sum<10) {
        node = new ListNode(sum);
        gt = 0;
      }else
      {
        node = new ListNode(sum%10);
        gt = 1;
      }
      if(s == null)
      {
        s = node;
        head = s;
      }else
      {
        s.next = node;
        s = s.next;
      }
      num1 = num1!= null ? num1.next : num1;
      num2 = num2 != null ? num2.next : num2;
    }
    if(gt == 1)
    {
      s.next = new ListNode(1);
    }
    return head;
  }
  public static void main(String[] args)
  {
    ListNode l1 = new ListNode(5);
    ListNode head1 = l1;


    ListNode l2 = new ListNode(5);
    ListNode head2 = l2;

    AddTwoNumbers_2 to = new AddTwoNumbers_2();
    ListNode sum = to.addTwoNumbers(head1,head2);
    while(sum!=null)
    {
      System.out.println(sum.val);
      sum = sum.next;
    }
  }
}
