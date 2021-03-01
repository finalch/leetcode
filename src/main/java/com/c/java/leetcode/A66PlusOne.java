package com.c.java.leetcode;

import java.util.Arrays;

/**
 * @author liufan
 * @date 2021/3/1 22:18
 **/
public class A66PlusOne {
    public static void main(String[] args) {
        int[] a = new A66PlusOne().plusOne(new int[]{1, 9});
        Arrays.stream(a).forEach(System.out::print);
    }

    public int[] plusOne(int[] digits) {
        int i = 0;
        for (; i < digits.length; i++) {
            if (digits[i] < 9) {
                break;
            }
        }
        if (i == digits.length) {
            int[] a = new int[digits.length + 1];
            a[0] = 1;
            for (int j = 1; j < a.length; j++) {
                a[j] = 0;
            }
            return a;
        }
        int[] a = new int[digits.length];
        int s = 1;
        for (i = digits.length - 1; i >= 0; i--) {
            int b = digits[i] + s;
            if (b > 9) {
                s = 1;
                a[i] = b - 10;
            } else {
                s = 0;
                a[i] = b;
            }
        }
        return a;
    }
}
