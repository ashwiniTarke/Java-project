package com.tech;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Employee e =new Employee();
		
		Employee e= Employee.getObject();
		Employee e1= Employee.getObject();
		Employee e2= Employee.getObject();
		
		System.out.println("e "+e.hashCode());
		System.out.println("e1 "+e1.hashCode());
		System.out.println("e2 "+e2.hashCode());
		
		System.out.println(e==e1);
	}

}
