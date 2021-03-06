package com.finalch.leetcode.common;

import java.util.function.Consumer;

/**
 * @author liufan
 * @date 2021/2/28 14:55
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode create(int[] nums) {
        ListNode listNode = null, pre = null;
        for (int num : nums) {
            ListNode t = new ListNode(num);
            if (listNode == null) {
                listNode = t;
                pre = t;
            } else {
                pre.next = t;
                pre = pre.next;
            }
        }
        return listNode;
    }

    public static void foreach(final ListNode head, Consumer<ListNode> action) {
        ListNode p = head;
        while (p != null) {
            action.accept(p);
            p = p.next;
        }
    }
}
