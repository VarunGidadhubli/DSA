package datastructures.code.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentElementsHeap {

	public static void main(String args[]) {
		
		int arr[] = { 1, 1, 1, 1, 2, 2, 3, 3, 3 }, k = 2;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int a:arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> pq = 
					new PriorityQueue<Map.Entry<Integer, Integer>>(
                        (e1, e2) -> e1.getValue() - e2.getValue()
                );
		
		for(Map.Entry<Integer,Integer> currentSet:map.entrySet()) {
		
			pq.add(currentSet);
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		Iterator<Entry<Integer, Integer>> iterator=pq.iterator();
		
		while(iterator.hasNext()) {
			
			Entry<Integer, Integer> currentIterator=iterator.next();
			System.out.println(currentIterator.getKey());
		}
	}
}
