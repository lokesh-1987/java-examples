package com.java.examples;

import java.util.Stack;

//b) Valid Parenthesis
//Input String = [()()]{}
//output = true
//Input String = []{()})
//output = false
public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(isValid1("()"));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == '}' && stack.pop() != '{') {
                    return false;
                } else if (c == ']' && stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{')
                        || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
