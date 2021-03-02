package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/2/28 16:14
 **/
public class RemoveDuplicates {
    // 0 0 0 0 1 1
    // 0 1 0 0 1 1
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int i = 0;
        // 判断i+1位置是否需要被替换
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
