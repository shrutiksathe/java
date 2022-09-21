package com.day17_Inheritance;

class Fruit{
	String f="Fruit";
}
class Apple extends Fruit{
     void Display() {
    	System.out.println(" Apple is a "+f);
    }
}

public class Single_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple();
		a.Display();

	}

}
