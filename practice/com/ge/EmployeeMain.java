package com.ge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main1(String[] args) {

		EmployeePojo emp = new EmployeePojo();

		emp.setEmpID("3");
		emp.setEmpName("SATISH");
		emp.setSal("20");

		EmployeePojo emp1 = new EmployeePojo();

		emp1.setEmpID("2");
		emp1.setEmpName("muktawar");
		emp1.setSal("30");

		EmployeePojo emp2 = new EmployeePojo();

		emp2.setEmpID("1");
		emp2.setEmpName("GE");
		emp2.setSal("40");

		List<EmployeePojo> list = Arrays.asList(emp, emp1, emp2);
		List<EmployeePojo> obj = new ArrayList<>();

		obj = list.stream().filter(a -> a.equals(emp)).collect(Collectors.toList());
		System.out.println(obj);
		
		//obj = list.stream().sorted().collect(Collectors.toList());
		//System.out.println("sorted:  " +obj);
		Comparator<EmployeePojo> sortbyID = (i1, i2) -> i1.getEmpID().compareTo(i2.getEmpID());
		Comparator<EmployeePojo> sortbyName = (i1, i2) -> i1.getEmpName().compareTo(i2.getEmpName());
		Comparator<EmployeePojo> sortBySal = (i1, i2) -> i1.getSal().compareTo(i2.getSal());

		
		list.stream()
        .sorted(
        		sortbyID
             .thenComparing(sortbyName)
             .thenComparing(sortBySal)
        )
        .forEach(
              a-> System.out.println()
        );
	
		Comparator<EmployeePojo> sortByID = (i1,i2)->i1.getEmpID().compareTo(i2.getEmpID());
		Comparator<EmployeePojo> sortbyName1 =(i1,i2)->i1.getEmpName().compareTo(i2.getEmpName());
		Comparator<EmployeePojo> sortBySal1 =(i1,i2)->i1.getSal().compareTo(i2.getSal());
		
		System.out.println("*********Sorting by ID*****************");
		list.stream().sorted(sortByID.thenComparing(sortbyName1).thenComparing(sortBySal)).forEach(a->System.out.println("printing sorted"+a));
		
		System.out.println("*********Sorting by Name*****************");
		
		list.stream().sorted(sortbyName1.thenComparing(sortByID).thenComparing(sortBySal)).forEach(a->System.out.println("printing sorted"+a));
		
		
		
		System.out.println("*********Sorting by Sal*****************");
		
		list.stream().sorted(sortBySal.thenComparing(sortByID).thenComparing(sortbyName1)).forEach(a->System.out.println("printing sorted"+a));
		
		//System.out.println(Collections.sort(list,Collections.reverseOrder()));
		
		System.out.println("Printing in Reverese order");
		Collections.sort(list,Collections.reverseOrder());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {

		EmployeePojo emp = new EmployeePojo();

		emp.setEmpID("3");
		emp.setEmpName("SATISH");
		emp.setSal("20");

		EmployeePojo emp1 = new EmployeePojo();

		emp1.setEmpID("2");
		emp1.setEmpName("muktawar");
		emp1.setSal("30");

		EmployeePojo emp2 = new EmployeePojo();

		emp2.setEmpID("1");
		emp2.setEmpName("GE");
		emp2.setSal("40");

		List<EmployeePojo> list = Arrays.asList(emp, emp1, emp2);
		List<EmployeePojo> obj = new ArrayList<>();

		List<String> list1=Arrays.asList("A","B","C","D");
		list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(a->System.out.println("First: "+a));
		//System.out.println(list1);
		
		 List<String> alphabets = Arrays.asList("E", "A", "G", "P", "L");  
		   List<String> reverseSortedAlphabets = alphabets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
		   reverseSortedAlphabets.forEach(item->System.out.println("Reverse: "+item)); 
		   List<String> ascendingOrder = alphabets.stream().sorted().collect(Collectors.toList());
		   ascendingOrder.forEach(a->System.out.println("ACCCC: "+ascendingOrder));
		   
		   
	}

}
