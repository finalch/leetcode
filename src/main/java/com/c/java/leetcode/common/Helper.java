package com.c.java.leetcode.common;

/**
 * @author liufan
 * @date 2021/2/28 14:56
 **/
public class Helper {
    public static void main(String[] args) {
        Helper.initTreeNodes(new String[]{"1", "2", null, "3", "4", null, null, "4", "3"});
    }

    public static TreeNode initTreeNodes(String[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode f = dp(nums, 0);
        return f;
    }


    private static TreeNode dp(String[] nums, int i) {
        if (nums[i] == null) {
            return null;
        }
        TreeNode treeNode = new TreeNode(Integer.parseInt(nums[i]));
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
