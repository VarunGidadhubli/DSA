package datastructures.code.arrays;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String args[]) {

		String s = "racecar", t = "carrace";
		System.out.println(checkIfAnagrams(s,t));

	}

	public static boolean checkIfAnagrams(String s, String t) {
		
		int[] count = new int[26];
		
		for(char c:s.toCharArray()) {
			count[c-'a']++;
		}
		
		for(char c:t.toCharArray()) {
			count[c-'a']--;
		}
		
		for(int c:count) {
			if(c!=0)
				return false;
		}
		
		return true;
	}
	
	
	/*public static boolean checkIfAnagrams(String s, String t) {

		HashMap<Character,Integer> map = new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}

		for(int j=0;j<t.length();j++) {
			
			if(!map.containsKey(t.charAt(j))) {
				return false;
			}else if(map.get(t.charAt(j))-1==0){
				map.remove(t.charAt(j));
			}else {
				map.put(t.charAt(j), map.get(t.charAt(j))-1);
			}
		}

		boolean isAnagram=map.size()==0?false:true;
		return isAnagram;
	}*/
}
