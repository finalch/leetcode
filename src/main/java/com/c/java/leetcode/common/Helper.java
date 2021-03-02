package com.c.java.leetcode.common;

/**
 * @author liufan
 * @date 2021/2/28 14:56
 **/
public class Helper {
    public static void main(String[] args) {
        Helper.initTreeNodes(new int[]{1, 2, 2, 3, 4, 4, 3});
    }

    public static TreeNode initTreeNodes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return dp(nums, 0);
    }

    private static TreeNode dp(int[] nums, int i) {
        TreeNode treeNode = new TreeNode(nums[i]);
        int l = (i << 1) + 1;
        int r = (i << 1) + 2;
        if (l < nums.length) {
            treeNode.left = dp(nums, l);
        }
        if (r < nums.length) {
            treeNode.right = dp(nums, r);
        }
        return treeNode;
    }

}
