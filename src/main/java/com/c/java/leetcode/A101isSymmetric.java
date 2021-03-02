package com.c.java.leetcode;

import com.c.java.leetcode.common.Helper;
import com.c.java.leetcode.common.TreeNode;

/**
 * @author liufan
 * @date 2021/3/2 10:31
 **/
public class A101isSymmetric {
    public static void main(String[] args) {
        System.out.println(new A101isSymmetric().isSymmetric(Helper.initTreeNodes(new int[]{1, 2, 2, 3, 1, 4, 3})));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return dp(root.left, root.right);
    }

    private boolean dp(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.val == right.val) {
            return dp(left.left, right.right) && dp(left.right, right.left);
        }
        return false;
    }

}
