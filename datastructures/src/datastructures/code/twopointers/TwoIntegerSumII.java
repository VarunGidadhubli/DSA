package datastructures.code.twopointers;

public class TwoIntegerSumII {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4},target = 3;
		boolean targetFound=false;
		
		for(int i=0,j=arr.length-1;i<j;) {
			
			if(arr[i]+arr[j]==target) {
				targetFound=true;
				break;
			}else if(arr[i]+arr[j]>target) {
				j--;
			}else {
				i++;
			}
		}
		
		System.out.println(targetFound);
	}

}
