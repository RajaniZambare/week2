package com.greatlearning.assignment;
import java.util.*;

public class MonthlySalary {
	
	public void monthlySalary(ArrayList<Employee> emp) {
				
		HashMap<Integer, Integer> salaryMap = new HashMap<Integer, Integer>();

		salaryMap.put(emp.get(0).emp_id,emp.get(0).salary/12);
		salaryMap.put(emp.get(1).emp_id,emp.get(1).salary/12);
		salaryMap.put(emp.get(2).emp_id,emp.get(2).salary/12);
		salaryMap.put(emp.get(3).emp_id,emp.get(3).salary/12);
		salaryMap.put(emp.get(4).emp_id,emp.get(4).salary/12);
		
		System.out.println("Monthly Salary Of Employee Along With Their ID Is");
		System.out.println(""+salaryMap);
		}
}