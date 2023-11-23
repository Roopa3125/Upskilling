package com.ge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SequenceOfOrder {

	public static void sortBySeq() {

		int[] arr = {1,1,1,4,4,5,5,6,7,8}; // input array
		
		Map<Integer,Integer> mapSequence = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length ;i++) {
			
			if(mapSequence.containsKey(arr[i])) {
				mapSequence.put(arr[i], mapSequence.get(arr[i])+1);
			} else {
				mapSequence.put(arr[i], 1);
			
			
			
		}
		
		List<Integer> list = new ArrayList<>();
		
		 mapSequence.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(sorted->{
					for(int j=0; j<sorted.getValue();j++) {
						list.add(sorted.getKey());
						break;
					}
					
				});
		 System.out.println("Print:: "+list);
	}
	}
	public static void main(String[] args) {
		SequenceOfOrder s= new SequenceOfOrder();
		s.sortBySeq();
	}
	

}
