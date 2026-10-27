package datastructures.code.stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "([{}])";

        System.out.println(isValidParentheses(s));
    }

    private static boolean isValidParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            // Closing bracket
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                if (ch == ')' && stack.peek() != '(') {
                    return false;
                }

                if (ch == ']' && stack.peek() != '[') {
                    return false;
                }

                if (ch == '}' && stack.peek() != '{') {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}