package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/7 13:18
 **/
public class A11 {
    public static void main(String[] args) {
        System.out.println(new A11().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (j > i) {
            int s = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(s, max);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }
        return max;
    }
}
