package datastructures.code.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TopKFrequentElements {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 1, 2, 2, 3, 3, 3 }, k = 2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		
		sortByValue(map,k);
	}
	
	private static void sortByValue(HashMap<Integer, Integer> map, int k) {
		
		Set<Entry<Integer, Integer>> set=map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<>(set);
		
		Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e2.getValue()-e1.getValue();
			}
			
		};
		
		list.sort(comparator);
		
		for (int i = 0; i < k; i++) {
		    System.out.print(list.get(i).getKey() + " ");
		}
		
	}
}