package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/3/5 17:15
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * <p>
 * 输入：s = "a"
 * 输出："a"
 * <p>
 * P(i,j)标识s[i]...s[j]是否为回文子串
 * 则P(i,j) == true, when P(i+1,j-1) == true && s[i] ==s[j]
 * *            j
 * *            b       a       b       b       b       b
 * * i      b  true    false    true    false   false   false
 * *        a          true     false   false   false   false
 * *        b                   true    true    true    true
 * *        b                           true    true    true
 * *        b                                   true    true
 * *        b                                           true
 **/
public class A5 {
    public static void main(String[] args) {
        System.out.println(new A5().longestPalindrome(""));
    }

    public String longestPalindrome(String s) {
        int length;
        if (s == null || (length = s.length()) <= 1) {
            return s;
        }
        int max = 0, begin = 0;
        boolean[][] dps = new boolean[length][length];
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) {
                    dps[i][j] = true;
                } else if (j - i == 1) {
                    dps[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    dps[i][j] = dps[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                }
                if (dps[i][j] && (j - i + 1) > max) {
                    max = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + max);
    }
}
