package com.finalch.leetcode;

import java.util.Stack;

/**
 * @author liufan
 * @date 2021/2/27 17:57
 **/
public class A20IsValid {
    public static void main(String[] args) {
        System.out.println(new A20IsValid().isValid("{()[]}"));
    }

    // ((([]){}))
    public boolean isValid(String s) {
        if (s == null || s.length() == 0 || s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterStack.empty() || !check(characterStack.peek(), c)) {
                characterStack.push(c);
            } else {
                characterStack.pop();
            }
        }
        return characterStack.empty();
    }

    public boolean check(char a, char b) {
        return ('(' == a && ')' == b)
                || ('{' == a && '}' == b)
                || ('[' == a && ']' == b);
    }
}
