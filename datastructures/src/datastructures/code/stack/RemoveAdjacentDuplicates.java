package datastructures.code.stack;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		Stack<Integer> tempStack = new Stack<>();
		int currentValue=0;

        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(1);

        //System.out.println(stack);//[1, 1, 2, 2, 2, 3, 1, 1]

        while (!stack.isEmpty()) {
        	currentValue=stack.pop();
            while(!stack.isEmpty() && currentValue==stack.peek()) {
            	stack.pop();
            }
            tempStack.add(currentValue);
        }
        //System.out.println(tempStack);
        
        while(!tempStack.isEmpty()) {
        	stack.push(tempStack.pop());
        }
        System.out.println(stack);

	}
}