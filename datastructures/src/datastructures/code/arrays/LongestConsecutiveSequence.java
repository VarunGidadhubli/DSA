package datastructures.code.arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {

		int arr[]= {0,3,2,5,4,6,1,1};
		int maxSequence=1;

		HashSet<Integer> set=new HashSet<Integer>();

		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}

		for(int i=0;i<arr.length;i++) {

			if(!set.contains(arr[i]-1)) {

				int counter=1;
				int currentBegin=arr[i];

				while(set.contains(currentBegin+1)) {
					++counter;
					++currentBegin;
				}

				maxSequence=Math.max(maxSequence, counter);
			}

		}

		System.out.println(maxSequence);
	}
}