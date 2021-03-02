package com.c.java.leetcode;

import com.c.java.leetcode.common.Helper;
import com.c.java.leetcode.common.TreeNode;

/**
 * @author liufan
 * @date 2021/3/2 11:31
 **/
public class A100IsSameTree {
    public static void main(String[] args) {
        TreeNode p = Helper.initTreeNodes(new String[]{"1", "0", "3"});
        TreeNode q = Helper.initTreeNodes(new String[]{"1", "2", "3"});
        System.out.println(new A100IsSameTree().isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
