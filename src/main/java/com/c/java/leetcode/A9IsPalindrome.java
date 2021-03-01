package com.c.java.leetcode;

/**
 * @author liufan
 * @date 2021/2/27 15:59
 **/
public class A9IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(190001));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int a = x % 10;
            x = x / 10;
            result = result * 10 + a;
        }
        return result;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == reverse(x);
    }
}
