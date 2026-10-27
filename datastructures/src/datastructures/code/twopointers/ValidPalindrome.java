package datastructures.code.twopointers;

public class ValidPalindrome {

	public static void main(String[] args) {

		String s = "tab a cat";
		s=s.replaceAll("\\s", "").toLowerCase();
		
		System.out.println(checkIfPalindrome(s));
		
	}
	
	private static boolean checkIfPalindrome(String s) {
	
		for(int i=0,j=s.length()-1;i<=j;i++,j--) {
			if(!(s.charAt(i)==s.charAt(j))) {
				return false;
			}
		}
		
		return true;
	}

}
