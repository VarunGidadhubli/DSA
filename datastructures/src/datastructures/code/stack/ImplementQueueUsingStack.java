package datastructures.code.stack;

import java.util.Stack;

public class ImplementQueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void insert(Integer value) {
        stack1.push(value);
    }

    public int remove() {

        // Move everything from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Oldest element is now on top
        int value = stack2.pop();

        // Move remaining elements back
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }

    public int peek() {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int value = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {

        ImplementQueueUsingStack queue =
                new ImplementQueueUsingStack();

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);

        System.out.println(queue.remove()); // 10
        System.out.println(queue.remove()); // 20
        System.out.println(queue.peek());   // 30
    }
}