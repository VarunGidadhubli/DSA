package datastructures.code.stack;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		
		Stack<Integer> minStack = new Stack<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		min=pushValues(stack,minStack,10,min);
		min=pushValues(stack,minStack,9,min);
		min=pushValues(stack,minStack,11,min);
		min=pushValues(stack,minStack,5,min);
		min=pushValues(stack,minStack,1,min);
		min=pushValues(stack,minStack,20,min);
		
		stack.pop();
		stack.pop();
		
		System.out.println(minStack.peek());
	}

	private static int pushValues(Stack<Integer> stack,Stack<Integer> minStack,int valueToPush,int min) {
		stack.push(valueToPush);
		min = Math.min(valueToPush, min);
		minStack.add(min);
		return min;
	}
}
