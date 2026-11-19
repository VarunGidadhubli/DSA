package datastructures.code.twopointers;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = {2, 7, 11, 15};
		int target = 9;
		int firstIndex=0, lastIndex=arr.length-1;
		
		while(firstIndex<=lastIndex) {
			
			if(arr[firstIndex]+arr[lastIndex]==target) {
				System.out.println("Sum found at "+firstIndex+" "+lastIndex);
				return;
			}else if(arr[firstIndex]+arr[lastIndex]>target) {
				lastIndex--;
			}else {
				firstIndex++;
			}
		}
		
	}
}