package datastructures.code.general;

public class ReverseAString {

	public static void main(String[] args) {

		String s="abcd";
		char arr[]=s.toCharArray();
		
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.println(arr);
	}

}