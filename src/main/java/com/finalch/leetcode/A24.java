package com.finalch.leetcode;

import com.finalch.leetcode.common.ListNode;

/**
 * @author liufan
 * @date 2021/3/11 16:18
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 **/
public class A24 {
    public static void main(String[] args) {
        ListNode head = new A24().swapPairs(ListNode.create(new int[]{1, 2, 3}));
        ListNode.foreach(head, i -> System.out.println(i.val));
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
