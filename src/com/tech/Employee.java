package com.tech;

public class Employee {
	
	private Employee(){
		
	}
	//private static Singleton variable
	private static Employee object;
	
	//private static Singleton method
	public static Employee getObject() {
		
		if(object==null) {
			 object=new Employee();
		}
		return object;
		
	}

}
