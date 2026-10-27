package datastructures.code.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int arr[]= {-1,0,1,2,-1,-4};
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		
		Arrays.sort(arr); // -4, -1, -1, 0, 1, 2
		
		for(int i=0;i<arr.length;i++) {
			
			int left=i+1, right=arr.length-1;
			
			while(left<right) {
				
				if(arr[i]+arr[left]+arr[right]==0) {
					
					List<Integer> list = new ArrayList<Integer>();
					list.add(arr[i]);
					list.add(arr[left]);
					list.add(arr[right]);
					set.add(list);
					
					left++;
					right--;
					
				}else if(arr[i]+arr[left]+arr[right]>0) {
					right--;
				}else {
					left++;
				}
			}
		}
	
		System.out.println(set);
	}
}