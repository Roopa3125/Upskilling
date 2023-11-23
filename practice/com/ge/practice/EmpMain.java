package com.ge.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		
		EmployeeTest test = new EmployeeTest();
		test.setEmpID("3");
		test.setEmpName("Ganesh");
		test.setSal("10K");
		

		EmployeeTest test1 = new EmployeeTest();
		test1.setEmpID("2");
		test1.setEmpName("Satish");
		test1.setSal("11K");
		

		EmployeeTest test2 = new EmployeeTest();
		test2.setEmpID("1");
		test2.setEmpName("Hemanth");
		test2.setSal("12K");
		
		List<EmployeeTest> alist = Arrays.asList(test, test1, test2);
		System.out.println("Printing data  :"+alist.toString());
		
		List<EmployeeTest> obj = new ArrayList<>();
		
		obj = alist.stream().filter(a->a.equals(test1)).collect(Collectors.toList());
		System.out.println("printing 1st cond:: " +obj);
		
		
		Comparator<EmployeeTest> empid = (i1,i2)->i1.getEmpID().compareTo(i2.getEmpID());
		Comparator<EmployeeTest> name = (i1,i2)->i1.getEmpName().compareTo(i2.getEmpName());
		Comparator<EmployeeTest> sal = (i1,i2)->i1.getSal().compareTo(i2.getSal());
		
		alist.stream().sorted(empid.thenComparing(empid)).collect(Collectors.toList()).forEach(tem->System.out.println("asecending: "+tem));
		
		alist.stream().sorted(empid.thenComparing(empid).thenComparing(name).thenComparing(sal))
		.collect(Collectors.toList()).forEach(tem->System.out.println("Printing based upon empud: "+tem));
		
		alist.stream().sorted(name.thenComparing(name).thenComparing(empid).thenComparing(sal))
		.collect(Collectors.toList()).forEach(tem->System.out.println("Printing based upon name: "+tem));
	
	
		
	}

}
