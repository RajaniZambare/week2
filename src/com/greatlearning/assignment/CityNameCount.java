package com.greatlearning.assignment;

import java.util.*;

public class CityNameCount{
		
	public void cityCount(ArrayList<Employee> emp) {
		
		ArrayList<String> city = new ArrayList<String>();
		
		city.add(emp.get(0).getCity());
		city.add(emp.get(1).getCity());
		city.add(emp.get(2).getCity());
		city.add(emp.get(3).getCity());
		city.add(emp.get(4).getCity());
		
		HashSet<String> hsUnique = new HashSet<String>(city);
	    HashMap<String, Integer> cityMap = new HashMap<String, Integer>();
	  
	    // Iterate using enhanced for-loop
	    	for (String strElement : hsUnique) {
	    		cityMap.put(strElement,Collections.frequency(city, strElement));
	        }
	    
	    	System.out.println("Count Of Employees From Each City");
	    	System.out.println(""+cityMap);
	 }
}
