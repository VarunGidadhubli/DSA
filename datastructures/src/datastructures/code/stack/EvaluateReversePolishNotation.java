package datastructures.code.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {

		String tokens[]= {"1","2","+","3","*","4","-"};

		Stack<Integer> stack = new Stack<Integer>();
		Integer finalValue = null;

		for(int i=0;i<tokens.length;i++) {

			if(tokens[i].matches("-?\\d+")) {
				stack.push(Integer.parseInt(tokens[i]));
			}else {

				Integer operand1=stack.pop();
				Integer operand2=stack.pop();
				
				if(tokens[i].equals("+")) {
					finalValue=operand2+operand1;
					stack.push(finalValue);
				}else if(tokens[i].equals("-")) {
					finalValue=operand2-operand1;
					stack.push(finalValue);
				}else if(tokens[i].equals("*")) {
					finalValue=operand2*operand1;
					stack.push(finalValue);
				}else {
					finalValue=operand2/operand1;
					stack.push(finalValue);
				}
				
			}
		}
		
		System.out.println(finalValue);
	}

}