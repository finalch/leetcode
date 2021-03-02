package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/1 22:48
 **/
public class A67AddBinary {
    public static void main(String[] args) {
        System.out.println(new A67AddBinary().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int step = 0;
        while (i >= 0 || j >= 0) {
            int m = 0, n = 0;
            if (i >= 0) {
                m = a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                n = b.charAt(j) - '0';
                j--;
            }
            int c = m + n + step;
            if (c > 1) {
                stringBuilder.append(c - 2);
                step = 1;
            } else {
                stringBuilder.append(c);
                step = 0;
            }
        }
        if (step == 1) {
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}
