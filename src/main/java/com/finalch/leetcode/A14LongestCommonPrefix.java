package com.finalch.leetcode;

/**
 * @author liufan
 * @date 2021/2/27 17:29
 **/
public class A14LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"fly", "flower", "fl"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        for (int i = 0; i < first.length(); i++) {
            char ci = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != ci) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
