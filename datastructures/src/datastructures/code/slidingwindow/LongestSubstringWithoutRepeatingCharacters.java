package datastructures.code.slidingwindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		String s="abccad";
		HashSet<Character> set= new HashSet<Character>();
		int maxSoFar=1, left=0;

		set.add(s.charAt(0));

		for(int i=1;i<s.length();i++) {

			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(i));
			maxSoFar=Math.max(maxSoFar, set.size());

		}

		System.out.println(maxSoFar);
	}

}