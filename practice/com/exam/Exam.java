package com.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam {

	public static void main1(String[] args) {
		var list = new ArrayList<>();
		list.add("a");
		list.add(1);
		for(var element :list) {
			System.out.println(element+"");
		}
      for(var i=0; i<list.size(); i++) {
    	  System.out.println(list.get(i)+"");
    	  
	
}
	}
	public static void main2(String[] args) {
		String arr[] = {
				"one", "Two"
		};
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		list.add("Three");
	}

	public static void main(String[] argv) throws Exception {
		String html = "<img src=\"asdf\" onload=\"adsf\" adsf/>";
		// System.out.println(RemoveImgTag(html));
		Pattern patternImg = Pattern.compile(html);
		Matcher m = patternImg.matcher(html);

		while (m.find()) {
			html = m.replaceAll("");
			System.out.println("bla :" + html);
		}
	}  
}
