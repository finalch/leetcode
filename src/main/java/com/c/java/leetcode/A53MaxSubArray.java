package com.c.java.leetcode;

/**
 * @author liufan
 * @date 2021/3/1 14:21
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 **/
public class A53MaxSubArray {
    public static void main(String[] args) {
        System.out.println(new A53MaxSubArray().maxSubArray(new int[]{-2, 1, 2, -9}));
    }

    public int maxSubArray(int[] nums) {
        return dp(nums);
    }

    /**
     * 动态规划
     * f(i)标识以i为结束的连续数组的最大和
     * f(i) = f(i-1) > 0? f(i-1) + nums[i] : nums[i];
     *
     * @param nums
     * @return
     */
    private int dp(int[] nums) {
        int max = nums[0];
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (f[i - 1] > 0) {
                f[i] = f[i - 1] + nums[i];
            } else {
                f[i] = nums[i];
            }
            max = Math.max(f[i], max);
        }
        return max;
    }
}
