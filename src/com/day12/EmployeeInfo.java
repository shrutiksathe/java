package com.day12;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setId(1);                              //set method 
		obj.setName("Shrutik");
		
		System.out.println(obj.getId());        //get method to print
		System.out.println(obj.getName());
	}

}
