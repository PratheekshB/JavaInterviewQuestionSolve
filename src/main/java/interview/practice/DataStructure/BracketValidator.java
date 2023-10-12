package interview.practice.DataStructure;

import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        String str = "({[]})";
        if (isValid(str)) {
            System.out.println("Bracket is Valid");
        } else {
            System.out.println("Bracket is Invalid");
        }
    }
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(' || c == '}' && !stack.isEmpty() && stack.peek() == '{' || c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}