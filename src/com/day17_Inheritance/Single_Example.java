package com.day17_Inheritance;
class Vehical{
	String name="Vehical";
 }
 class Car extends Vehical{
	 void show() {
		 System.out.println("Car is a "+name);
	 }
 }


public class Single_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car c=new Car();
         c.show();
	}

}
