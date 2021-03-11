package com.finalch.leetcode;

import com.finalch.leetcode.common.ListNode;

/**
 * @author liufan
 * @date 2021/3/11 09:53
 * <p>
 * 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 **/
public class A23 {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = ListNode.create(new int[]{1, 4, 5});
        lists[1] = ListNode.create(new int[]{1, 3, 4});
        lists[2] = ListNode.create(new int[]{2, 6});
        ListNode head = new A23().mergeKLists(lists);
        ListNode.foreach(head, i -> System.out.println(i.val));
    }

    public ListNode mergeKLists(ListNode[] lists) {
        // return mergeForce(lists);
        return mergeDevide(lists, 0, lists.length - 1);
    }

    private ListNode mergeDevide(ListNode[] lists, int l, int r) {
        // System.out.println(l + "  -  " + r);
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int m = (l + r) >> 1;
        return doMergeWithNewHead(mergeDevide(lists, l, m), mergeDevide(lists, m + 1, r));

    }

    private ListNode mergeForce(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = doMergeWithNewHead(head, lists[i]);
        }
        return head;
    }

    private ListNode doMerge(ListNode p, ListNode q) {
        ListNode pre = null, head = null;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                if (pre == null) {
                    pre = p;
                } else {
                    pre.next = p;
                }
                p = p.next;
            } else {
                if (pre == null) {
                    pre = q;
                } else {
                    pre.next = q;
                }
                q = q.next;
            }
            pre = pre.next;
            if (head == null) {
                head = pre;
            }
        }
        pre.next = p != null ? p : q;
        return head;
    }

    private ListNode doMergeWithNewHead(ListNode p, ListNode q) {
        ListNode pre = new ListNode(-1);
        ListNode phead = pre;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                pre.next = p;
                p = p.next;
            } else {
                pre.next = q;
                q = q.next;
            }
            pre = pre.next;
        }
        pre.next = p != null ? p : q;
        return phead.next;
    }
}
