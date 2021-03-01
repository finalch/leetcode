package com.c.java.leetcode.common;

/**
 * @author liufan
 * @date 2021/2/28 14:55
 **/
public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int val) {
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
}
