package datastructures.code.general;

import java.util.HashMap;

public class CompressString {

	public static void main(String[] args) {

		String s="aaabbc"; //a3b2c1
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}

		String compressedString = "";

		for(Character key:map.keySet()) {
			compressedString=compressedString+key+map.get(key);
		}

		System.out.println(compressedString+" "+compressedString.length());
	}

}