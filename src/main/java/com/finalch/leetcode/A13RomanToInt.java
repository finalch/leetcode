package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/2/27 16:16
 **/
public class A13RomanToInt {
    public static void main(String[] args) {
        System.out.println(new A13RomanToInt().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        int i = 0, c = 0;
        for (; i < s.length() - 1; ) {
            int a = romanToInt(s.charAt(i));
            int b = romanToInt(s.charAt(i + 1));
            if (a < b) {
                c += (b - a);
                i += 2;
            } else {
                c += a;
                i++;
            }
        }
        if (i < s.length()) {
            c += romanToInt(s.charAt(i));
        }
        return c;
    }

    public int romanToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            default:
                return 1000;
        }
    }
}
