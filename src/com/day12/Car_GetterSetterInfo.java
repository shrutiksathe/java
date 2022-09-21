package com.day12;

public class Car_GetterSetterInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_GetterSetter obj=new Car_GetterSetter();
		obj.setModel_no(101);
		obj.setModel_name("Splender");
		obj.setPrice(80000);
		
		System.out.println(obj.getModel_no());
		System.out.println(obj.getModel_name());
		System.out.println(obj.getPrice());
	}

}
