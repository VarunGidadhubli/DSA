package datastructures.code.general;

import java.util.PriorityQueue;

public class FindKLargest {

	public static void main(String[] args) {

		int arr[]= {10,6,8,9,1,7},k=3;
		
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>((a,b)->(b-a));
		
		for(int a:arr) {
			priorityQueue.add(a);
		}
	
		while(k>1) {
			priorityQueue.poll();
			--k;
		}
		
		System.out.println(priorityQueue.peek());
	}

}