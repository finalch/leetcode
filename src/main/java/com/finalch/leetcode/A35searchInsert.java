package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/1 10:56
 **/
public class A35searchInsert {
    public static void main(String[] args) {
        System.out.println(new A35searchInsert().searchInsert(new int[]{1, 2, 3, 5, 6}, 9));
    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; i++) {
            if (target <= nums[i]) {
                break;
            }
        }
        return i;
    }
}
