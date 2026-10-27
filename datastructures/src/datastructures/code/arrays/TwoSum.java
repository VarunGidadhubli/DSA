package datastructures.code.arrays;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = {3,4,5,6}, target = 8, lowerIndex=0, higherIndex=arr.length-1;
	
		while(lowerIndex<higherIndex) {
			
			int sum = arr[lowerIndex]+arr[higherIndex];
			
			if(sum==target) {
				System.out.println(lowerIndex+" "+higherIndex);
				break;
			}
			
			if(sum<target) {
				lowerIndex++;
			}else {
				higherIndex--;
			}
		}
	}
}