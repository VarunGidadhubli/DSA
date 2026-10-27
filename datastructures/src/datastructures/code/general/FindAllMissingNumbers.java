package datastructures.code.general;

public class FindAllMissingNumbers {

	public static void main(String[] args) {

		int arr[] = {1, 2, 4, 7, 8, 10};
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]-arr[i-1]>1) {

				int start=arr[i-1]+1;
				int end=arr[i];//2
				
				while(start<end) {
					System.out.print(start +" ");
					start++;
				}
			}
		}
	}
}