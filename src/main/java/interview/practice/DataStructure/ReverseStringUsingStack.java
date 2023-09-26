package interview.practice.DataStructure;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reverse = new StringBuilder();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String result = reverseString(str);
        System.out.println(result);
    }
}
