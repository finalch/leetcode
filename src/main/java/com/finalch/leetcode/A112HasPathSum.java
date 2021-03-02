package com.finalch.leetcode;

import com.finalch.leetcode.common.Helper;
import com.finalch.leetcode.common.TreeNode;

/**
 * @author liufan
 * @date 2021/3/2 16:15
 **/
public class A112HasPathSum {
    public static void main(String[] args) {
        System.out.println(new A112HasPathSum().hasPathSum(Helper.initTreeNodes(new String[]{"1", "2"}), 0));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // System.out.println("target: " + targetSum + ", root: " + (root == null ? "null" : root.val));
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
