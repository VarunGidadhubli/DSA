package datastructures.code.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class MaximumAverageSubarrayI {

	public static void main(String[] args) {

		int arr[]= {1, 12, -5, -6, 50, 3};
		int k=4;
		
		List<Integer> averages= new ArrayList<Integer>();
		
		int left=0;
		int currentSum=0;
		
		for(int right=0;right<arr.length;right++) {
			
			currentSum=currentSum+arr[right];
			
			if(right - left + 1 == k) {
				averages.add(currentSum/k);
				currentSum=currentSum-arr[left];
				left++;
			}
		}
	}

}