package com.finalch.leetcode;

import com.finalch.leetcode.common.ListNode;

/**
 * @author liufan
 * @date 2021/3/8 17:47
 * <p>
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 **/
public class A19 {
    public static void main(String[] args) {
        new A19().removeNthFromEnd(ListNode.create(new int[]{1, 2, 3, 4}), 4);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        ListNode pre = head, q = head;
        while (q != null) {
            if (n < 0) {
                pre = pre.next;
            } else {
                n--;
            }
            q = q.next;
        }
        if (n >= 0) {
            return head.next;
        }
        pre.next = pre.next.next;
        return head;
    }
}
