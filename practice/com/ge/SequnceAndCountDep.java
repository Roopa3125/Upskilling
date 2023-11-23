package com.ge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SequnceAndCountDep {

	public  void sequnceOrder(int[] arrayParam ){
		
		Map<Integer, Integer> mapSequnce = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arrayParam.length; i++) {
			if(mapSequnce.containsKey(arrayParam[i])) {
				mapSequnce.put(arrayParam[i], mapSequnce.get(arrayParam[i]+1));
				
			} else {
				mapSequnce.put(arrayParam[i], 1);
			}
			
			mapSequnce.entrySet().stream().
			sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(sorted->{
				for(int j=0; j<sorted.getValue(); j++ ) {					
					list.add(sorted.getKey());
					//System.out.println("sorting :"+sorted.getKey() +":"+ sorted.getValue());
				}
			});
			 System.out.println("Print:: "+list);
		}
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr ={1,1,1,1,5,5,4,4,4,3,2,9};
		System.out.println("hellll");
		SequnceAndCountDep s = new SequnceAndCountDep();
		s.sequnceOrder(arr);
	}
}
