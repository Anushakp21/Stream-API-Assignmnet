package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	
	String name;
	String department;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : " + name +" department : " + department;
	}
	public static void main(String[] args) {
		List<Employee> list= Arrays.asList(new Employee("Anu", "Operation"),
				new Employee("tanu", "Sales"),
				new Employee("manu", "Sales"));
		Map<String, List<Employee>> result=list.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
		System.out.println(result);
	}
}
