package com.c.java.leetcode;

import com.c.java.leetcode.common.ListNode;

/**
 * @author liufan
 * @date 2021/3/1 23:13
 **/
public class A83DeleteDuplicates {
    public static void main(String[] args) {
        ListNode listNode = new A83DeleteDuplicates().deleteDuplicates(ListNode.create(new int[]{}));
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head, q = p.next;
        p.next = null;
        while (q != null) {
            if (q.val != p.val) {
                p.next = q;
                p = q;
            } else {
                p.next = null;
            }
            q = q.next;
        }
        return head;
    }
}
