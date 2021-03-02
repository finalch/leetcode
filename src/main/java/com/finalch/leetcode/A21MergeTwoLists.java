package com.finalch.leetcode;

import com.finalch.leetcode.common.ListNode;

/**
 * @author liufan
 * @date 2021/2/28 14:19
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 **/
public class A21MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = ListNode.create(new int[]{1, 4});
        ListNode l2 = ListNode.create(new int[]{1, 3, 4});
        ListNode l3 = new A21MergeTwoLists().mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode listNode = null, pre = null;
        ListNode p = l1, q = l2;
        while (p != null && q != null) {
            ListNode t = null;
            if (p.val < q.val) {
                t = p;
                p = p.next;
            } else {
                t = q;
                q = q.next;
            }
            if (listNode == null) {
                listNode = t;
                pre = t;
            } else {
                pre.next = t;
                pre = pre.next;
            }
        }
        if (p != null) {
            pre.next = p;
        }
        if (q != null) {
            pre.next = q;
        }
        return listNode;
    }
}
