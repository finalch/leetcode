package com.finalch.leetcode;

/**
 * @author: cjianping on 2020/8/7 17:55
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m = null, n = null;
        ListNode p = l1, q = l2;
        int s = 0;
        while (p != null || q != null) {
            int a = 0, b = 0;
            if (p != null) {
                a = p.val;
                p = p.next;
            }
            if (q != null) {
                b = q.val;
                q = q.next;
            }
            int t = a + b + s;
            s = t > 9 ? 1 : 0;
            ListNode listNode = new ListNode(t - 10 * s);
            if (n == null) {
                n = listNode;
                m = listNode;
            } else {
                n.next = listNode;
            }

        }
        if (s == 1) {
            ListNode listNode = new ListNode(1);
            n.next = listNode;
        }
        return m;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
