package com.greatlearning.assignment;

//Creating Employee class 
public class Employee {  
	    
	//Creating properties of Employee class  
	int emp_id, age, salary;
	String name, city, department;  
	  
	//Getter and setters for getting and setting properties  
	public void setEmployeeDetails(int emp_id, String name, int age, int salary, String department, String city) {  
	  try {
		  this.emp_id = emp_id; 
		  if(emp_id<0) {
			  throw new IllegalArgumentException("Employee ID Should Not Be Less Or Equel To Zero");
		  }
	      
		  this.name = name;
	      if(name.isEmpty()||name==null) {
	    	  throw new IllegalArgumentException("Employee Name Should Not Be Empty Or Null");
	      }
	      
	      this.age = age;
	      if(age<0) {
	    	  throw new IllegalArgumentException("Employee Age Should Not Be Less Or Equel To Zero");
	      }
	      
	      this.salary = salary;
	      if(salary<0) {
	    	  throw new IllegalArgumentException("Employee Salary Should Not Be Less Or Equel To Zero");
	      }
	      
	      this.department = department;
	      if(department.isEmpty()||department==null) {
	    	  throw new IllegalArgumentException("Employee Department Should Not Be Empty Or Null");
	      }
	      
	      this.city = city;
	      if(city.isEmpty()||city==null) {
	    	  throw new IllegalArgumentException("City Field Should Not Be Empty Or Null");
	      }
	  }catch(Exception e) {
		  System.out.println(" " + e.getMessage());
	  }
	} 
		
	public int getEmpId() {
		return emp_id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getSalary() {
		return salary;
	}	
	
	public String getDept() {
		return department;
	}
	
	public String getCity() {
		return city;
	}
	
	//Overriding toString() method  
	@Override  
	public String toString() {  
	    return " "+emp_id + " " + name + " " + age + " " + salary + " " + department + " " + city;  
	    }  
	      
}
