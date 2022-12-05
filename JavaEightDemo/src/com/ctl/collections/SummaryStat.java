package com.ctl.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ctl.employee.Employeeclass;

public class SummaryStat {

	public static void main(String[] args) {

		Employeeclass ecs = new Employeeclass(100, "sanketh", 11);
		Employeeclass ecs2 = new Employeeclass(102, "sanketh", 9);
		Employeeclass ecs3 = new Employeeclass(101, "jeeva", 98);
		Employeeclass ecs4 = new Employeeclass(103, "jolly", 15);

		List<Employeeclass> empl = Arrays.asList(ecs, ecs2, ecs3, ecs4);
		System.out.println(empl);

		List<Integer> employlist = empl.stream().map(e -> e.getId()).collect(Collectors.toList());
		System.out.println(employlist);

//		summarystatistics

		System.out.println(employlist.stream().mapToInt(x -> x).summaryStatistics().getMax());
		System.out.println(employlist.stream().mapToInt(x -> x).summaryStatistics().getMin());
		System.out.println(employlist.stream().mapToInt(x -> x).summaryStatistics().getAverage());
		System.out.println(employlist.stream().mapToInt(x -> x).summaryStatistics().getCount());

//	Slicing the list
//		find the second and third youngest person

		List<Integer> agelist = empl.stream().map(e -> e.getAge()).sorted().collect(Collectors.toList());
		System.out.println(agelist);

		List<Integer> slicedlist = agelist.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(slicedlist);

//		string to upper case and add comma

		List<String> casesen = empl.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(casesen);

		System.out.println(casesen.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(",  ")));

		
		System.out.println("***********************");
//		fond unique list
		Set<String> uniqulist = empl.stream().map(name -> name.getName()).collect(Collectors.toSet());
		System.out.println(uniqulist);

//		find duplicate elements in stream

		List<String> empllist = empl.stream().map(name -> name.getName()).collect(Collectors.toList());
		System.out.println(empllist);
		Set<String> uniquename = new HashSet<String>();
		System.out.println(uniquename);
		Set<String> newlist = empllist.stream().filter(x -> !uniquename.add(x)).collect(Collectors.toSet());
		System.out.println(newlist);

	}

}
