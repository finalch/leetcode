package com.c.java.leetcode;

/**
 * @author liufan
 * @date 2021/3/1 22:08
 **/
public class A58LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new A58LengthOfLastWord().lengthOfLastWord("Today is a nice day "));
    }

    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        int max = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                max++;
            } else if (max > 0) {
                return max;
            }
        }
        return max;
    }
}
