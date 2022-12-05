package com.ctl.protectedModifier;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ctl.demo.HashSetDemo;
import com.ctl.employee.Employeeclass;

public class ProtectedModi extends HashSetDemo {
	
	public static void main(String[] args) {
		
	
	ProtectedModi modeldemo = new ProtectedModi();
	
	System.out.println(modeldemo.addmethod(3, 5));
	
	
	Employeeclass ecs = new Employeeclass(100, "sanketh", 11);
	Employeeclass ecs2 = new Employeeclass(101, "sanketh", 11);
	Employeeclass ecs3 = new Employeeclass(102, "jeeva", 12);
	Employeeclass ecs4 = new Employeeclass(103, "jolly", 13);

	List<Employeeclass> empl = Arrays.asList(ecs,ecs2,ecs3,ecs4);
	
	System.out.println(empl);
	
	
	Map<String,Set<Employeeclass>> emplc = empl.stream().collect(Collectors.groupingBy(emp->emp.getName(),TreeMap::new, Collectors.toSet()));
	System.out.println(emplc);
	 
	
	}
	

}
