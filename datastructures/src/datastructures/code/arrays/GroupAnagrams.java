package datastructures.code.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {

        String strs[] = { "act", "pots", "tops", "cat", "stop", "hat" };

        Map<String, List<String>> map = new HashMap<String, List<String>>();

       for(String str:strs) {
    	   
    	char[] charArray=str.toCharArray();
    	int[] count=new int[26];
    	
    	for(char currentChar:charArray) {
    		
    		count[currentChar-'a']++;
    	}
    	
    	String key=Arrays.toString(count);
    	
    	if(!map.containsKey(key)) {
    		
    		map.put(key, new ArrayList<>());
    	}
    	
    	map.get(key).add(str);
    	
       }
       
       System.out.println(map.values());
    }
}