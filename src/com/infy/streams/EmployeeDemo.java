package com.infy.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class EmployeeDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Jagan", "DEV", 160000L, "Kamakshi"));
		list.add(new Employee(1, "Mohan", "DEV", 160000L, "Kamakshi"));
		list.add(new Employee(1, "Kamakshi", "DEV", 150000L, "Rani"));
		list.add(new Employee(1, "Rani", "DEV", 170000L, "Raja"));
		list.add(new Employee(1, "Raja", "DEV", 200000L, "Raja"));
		
		int[] i = new int[] {10,85};
		
		
		
		List<Employee> e=list.stream().sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(e);
		
		Map<String,List<Employee>> map = new HashMap<>();
		
		for(Employee e1:list) {
			if(map.containsKey(e1.getManager())) {
				List<Employee> al = new ArrayList<>();
				al.add(e1);
				map.put(e1.getManager(), al);
			}else {
				List<Employee> al = new ArrayList<>();
				al.add(e1);
				map.put(e1.getManager(), al);
			}
		}
		System.out.println(map);
	}
	
	

}
