package datastructures.code.general;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {

		String s="programming";
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		StringBuilder stringBuilder=new StringBuilder();
		for(char c:set) {
			stringBuilder.append(c);
		}
		System.out.println(stringBuilder);
	}

}