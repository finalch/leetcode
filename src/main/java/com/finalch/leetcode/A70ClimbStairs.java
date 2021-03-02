package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/1 23:02
 **/
public class A70ClimbStairs {
    public static void main(String[] args) {
        System.out.println(new A70ClimbStairs().climbStairs(3));
    }

    public int climbStairs(int n) {
        /*if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);*/
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}
