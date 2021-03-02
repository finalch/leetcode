package com.finalch.leetcode;

/**
 * @author finalch@163.com
 * @date 2021/2/27 15:02
 **/
public class A7Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        int result = 0;
        int c = 0;
        if (x == 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }
        if (x < 0) {
            return -reverse(-x);
        }
        while (x != 0) {
            c = x % 10;
            x = x / 10;
            if ((Integer.MAX_VALUE - c) / 10 < result) {
                return 0;
            }
            result = result * 10 + c;
        }
        return result;
    }
}
