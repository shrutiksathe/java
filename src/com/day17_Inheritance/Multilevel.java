package com.day17_Inheritance;
class Animals{
	String a="Animal";
}
class Dogs extends Animals{
	String d="Dog";
}
class Pet extends Dogs{
	 void display() {
		 System.out.println(d+" is a "+a+" and it is a pet");
	 }
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pet obj=new Pet();
         obj.display();
         
	}

}
