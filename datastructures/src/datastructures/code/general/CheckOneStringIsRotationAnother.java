package datastructures.code.general;

public class CheckOneStringIsRotationAnother {

	public static void main(String[] args) {

		String str1 = "rotation";
        String str2 = "tionrota";
        
        System.out.println(isStringRotation(str1, str2));
	}
	
	private static boolean isStringRotation(String str1, String str2) {
		
		char[] arr=str1.toCharArray();
		
		for(int i=0;i<arr.length-1;i++) {
		
			char temp=arr[arr.length-1];//n
			char temp2[]=new char[arr.length];
			
			for(int j=arr.length-1;j>0;j--) {
				
				temp2[j]=arr[j-1];
			}
			temp2[0]=temp;
			
			if(str2.equals(new String(temp2)))
				return true;
			
			arr = temp2;
		}
		
		return false;
	}

}
