package com.finalch.leetcode.common;

/**
 * @author liufan
 * @date 2021/3/2 11:52
 **/
public class A111MinDepth {
    public static void main(String[] args) {
        System.out.println(new A111MinDepth().minDepth(Helper.initTreeNodes(new String[]{"1", null, "3", null, null, null, "4"})));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    private int dp(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return 0;
        }
        if (left != null && right == null) {
            return 1 + dp(left.left, left.right);
        }
        if (left == null) {
            return 1 + dp(right.left, right.right);
        }
        return Math.min(1 + dp(left.left, left.right), 1 + dp(right.left, right.left));

    }
}
