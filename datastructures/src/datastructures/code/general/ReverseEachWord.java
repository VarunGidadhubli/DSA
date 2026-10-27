package datastructures.code.general;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s="Hello World Test"; // olleH dlroW
		String[] arr=s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			char currentString[]=arr[i].toCharArray();
			
			for(int j=0,k=currentString.length-1;j<k;j++,k--) {
				
				char temp=currentString[j];
				currentString[j]=currentString[k];
				currentString[k]=temp;
			}
			System.out.print(new String(currentString) + " ");
		}
	}

}