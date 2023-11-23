package com.list.map.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		List<Object> empList= new ArrayList<>();
		Map<String, Employee> empMap = new HashMap<>();
		
		emp.setEmployeeID(11);
		emp.setEmpName("Satish");
		emp.setSalary(12.00);
		
		emp1.setEmployeeID(12);
		emp1.setEmpName("Muktawar");
		emp1.setSalary(13.00);
		
		emp2.setEmployeeID(13);
		emp2.setEmpName("Prathyusha");
		emp2.setSalary(14.00);

		emp3.setEmployeeID(14);
		emp3.setEmpName("PP");
		emp3.setSalary(15.00);
		List<Employee> obj = Arrays.asList(emp, emp1, emp2, emp3);
		//empList.add(emp);
		
		for(Employee e : obj) {
		
			System.out.println(e.toString());
		
		}
		
		//using java 8
	//---------------------------------------------------------------------------------------------------------------------	
		List<Object> list = new ArrayList<>();
		//Step 1 filtering using one obejct
		list = obj.stream().filter(a ->a.equals(emp1)).collect(Collectors.toList());
		
		//Step 2 Filtering using complete object
		//list = obj.stream().collect(Collectors.toList());
		
		//Step 3 filtering using any object in list
		//List<Employee> ee = obj;
		//Optional<String> listOp = ee.stream().map(ee1 ->ee1.toString()).findAny();
		//if(listOp.isPresent()) 
		//	listOp.toString();
		//}
		
	System.out.println("Java 8  newlyyyyyy" +list);
//------------------------------------------------------------------------------------------------------------------------------	
	List<Employee> eList = obj;
	// Step 4 filter using each object
	list = eList.stream().map(a->((Employee) a).getEmployeeID()).collect(Collectors.toList());
	System.out.println("Java 8 using EmpID" +list);
	
	list = eList.stream().map(a->((Employee) a).getEmpName()).collect(Collectors.toList());
	System.out.println("Java 8 using EmpName" +list);
	
	list = eList.stream().map(a->((Employee) a).getSalary()).collect(Collectors.toList());
	System.out.println("Java 8 using EmpSal" +list);
	
	list = eList.stream().filter(a->a.equals(obj.get(1))).collect(Collectors.toList());
	System.out.println("Java 8 using obj" +list);
	
	//list = (List<Object>) eList.stream().filter(a->a.equals(obj)).forEach(null);;
	// filter using map and each field 
	list = eList.stream().map(temp -> {
        Employee e = new Employee();
        e.setEmployeeID(temp.getEmployeeID());
       e.setEmpName(temp.getEmpName());
        if (e.getEmpName().equals(temp.getEmpName())) {
           System.out.println("Into sucess");
           System.out.println(temp);
           
        }
        if("muktawar".equalsIgnoreCase(temp.getEmpName())) {
        	try {
				Thread.sleep(100);
				System.out.println("Into last if ");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	
        }
        return e;
    }).collect(Collectors.toList());
}
}
