package datastructures.code.arrays;

import java.util.HashMap;

public class ContainsDuplicate {

	public static void main(String args[]) {

		int arr[]= {1,2,3,3};

		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		map.put(arr[0], 1);
		
		System.out.println(isDuplicateKeyFound(map,arr));

	}

	public static boolean isDuplicateKeyFound(HashMap<Integer, Integer> map, int arr[]) {

		if(arr.length==1) {
			return false;
		}else {
			
			for(int i=1;i<arr.length;i++) {
				
				if(map.containsKey(arr[i]))
					return true;
				else
					map.put(arr[i], 1);
					
			}
		}
			

		return false;
	}
}