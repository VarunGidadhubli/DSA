package datastructures.code.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

	// Queue belongs to the Stack object
	private Queue<Integer> queue = new LinkedList<>();

	public void push(int value) {

		queue.offer(value);

		int size = queue.size();

		// Move all previous elements behind the newly added element
		for (int i = 0; i < size - 1; i++) {
			queue.offer(queue.poll());
		}
	}

	public int pop() {
		return queue.poll();
	}

	public int peek() {
		return queue.peek();
	}

	public boolean empty() {
		return queue.isEmpty();
	}

	public static void main(String[] args) {

		ImplementStackUsingQueue stack = new ImplementStackUsingQueue();

		stack.push(20);
		stack.push(10);
		stack.push(30);

		System.out.println(stack.pop());   // 30
		System.out.println(stack.peek());  // 10
		System.out.println(stack.pop());   // 10
	}
}