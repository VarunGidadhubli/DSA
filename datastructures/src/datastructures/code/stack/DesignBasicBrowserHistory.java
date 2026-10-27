package datastructures.code.stack;

import java.util.Stack;

public class DesignBasicBrowserHistory {

    public static void main(String[] args) {

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        // Visit pages
        backStack.push("Google");
        forwardStack.clear();

        backStack.push("YouTube");
        forwardStack.clear();

        backStack.push("Amazon");
        forwardStack.clear();

        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);

        // Click Back
        if (backStack.size() > 1) {
            forwardStack.push(backStack.pop());
        }

        System.out.println("After Back:");
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);

        // Click Forward
        if (!forwardStack.isEmpty()) {
            backStack.push(forwardStack.pop());
        }

        System.out.println("After Forward:");
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);

        // Click Close
        backStack.clear();
        forwardStack.clear();

        System.out.println("After Close:");
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);
    }
}