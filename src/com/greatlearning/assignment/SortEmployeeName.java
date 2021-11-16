package com.greatlearning.assignment;

import java.util.*;

public class SortEmployeeName {
	
	public void sortingNames(ArrayList<Employee> emp) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add(emp.get(0).getName());
		name.add(emp.get(1).getName());
		name.add(emp.get(2).getName());
		name.add(emp.get(3).getName());
		name.add(emp.get(4).getName());
		
		System.out.println("Names Of All Employees in The Sorted Order Are ");
	   
	    Collections.sort(name);   
	    System.out.println(""+name);
	   
	 }        
	
}