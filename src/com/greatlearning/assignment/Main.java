
package com.greatlearning.assignment;

import java.util.*;	
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		//Creating object of EmployeeDetails class  
        Employee emp1 = new Employee(); 
        Employee emp2 = new Employee(); 
        Employee emp3 = new Employee(); 
        Employee emp4 = new Employee(); 
        Employee emp5 = new Employee(); 
        
        //Setting values to the properties  
        emp1.setEmployeeDetails(1,"Aman",20,1100000,"IT","Delhi");
        emp2.setEmployeeDetails(2,"Bobby",22,500000,"Hr","Bombay");
        emp3.setEmployeeDetails(3,"Zoe",20,750000,"Admin","Delhi");
        emp4.setEmployeeDetails(4,"Smitha",21,1000000,"IT","Chennai");
        emp5.setEmployeeDetails(5,"Smitha",24,1200000,"IT","Bengaluru");
       
        
        //Adding Object to ArrayList
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
       
        //Showing Employee details  
        System.out.println("Display Employee Details:");
     	for(Employee e: employees){
			System.out.println(e);
     	}
     	System.out.println("-------------------------------------------------");
     	
		//Sort Employee Name
		SortEmployeeName ename = new SortEmployeeName();
		ename.sortingNames(employees);
		System.out.println("-------------------------------------------------");
		
		//City Name Count
		CityNameCount cityNameCount = new CityNameCount();
		cityNameCount.cityCount(employees);
		System.out.println("-------------------------------------------------");
		
		//Showing Monthly Salary
		MonthlySalary monthlySalary= new MonthlySalary();
		monthlySalary.monthlySalary(employees);
		System.out.println("-------------------------------------------------");
	}
}