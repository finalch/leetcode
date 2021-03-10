package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/5 15:43
 **/
public class A4 {
    public static void main(String[] args) {
        System.out.println(new A4().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0.00000;
        if (nums1.length == 0) {
            int mi = nums2.length >> 1;
            mid = (nums2.length & 1) == 0 ? (nums2[mi] + nums2[mi - 1]) >> 1 : nums2[mi];
        } else if (nums2.length == 0) {
            int mi = nums1.length >> 1;
            mid = (nums1.length & 1) == 0 ? (nums1[mi] + nums1[mi - 1]) >> 1 : nums1[mi];
        } else {
            int l = 0, r = 0;
            int i = 0, m = 0, j = nums1.length - 1, n = nums2.length - 1;
            while (j > i || n > m) {
                System.out.println("i: " + i + " j: " + j + " m: " + m + " n: " + n);
                if (m < 0 || nums1[i] < nums2[m]) {
                    l = nums1[i];
                    i++;
                } else {
                    l = nums2[m];
                    m++;
                }
                if (n < 0 || nums1[j] > nums2[n]) {
                    r = nums1[j];
                    j--;
                } else {
                    r = nums2[n];
                    n--;
                }
            }
            mid = m < 0 ? nums1[i] : nums1[m];
        }
        return mid;
    }
}
