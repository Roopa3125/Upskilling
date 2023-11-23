package com.list.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IteratingMap {

	public static void main(String[] args) {
		Map<String, Object> iteList = new HashMap<String, Object>();
		List<String> iteListing = new ArrayList<>();
		List<String> list = Arrays.asList("Satish","Muktawar","CG","ID");
		
		for(String user: list) {
		System.out.println(user.toString().toUpperCase());
		}
		
		iteListing = list.stream().map(map ->map.toUpperCase()).collect(Collectors.toList());
		
System.out.println("Java 8" + iteListing);
	}

}
