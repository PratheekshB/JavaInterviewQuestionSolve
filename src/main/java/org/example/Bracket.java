package org.example;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        String str = "({[]})";
        if (isValid(str)) {
            System.out.println("String is Valid");
        } else {
            System.out.println("String is Invalid");
        }
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
