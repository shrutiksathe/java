package com.day17_Super;
// super is used to invoke the parent class method
class Mobile{
	void Display() {                          //execute 2nd
		System.out.println("Mobile method");
	}

}
class Realme extends Mobile{
	void show() {
		System.out.println("Realme Method"); //execute 1st
		super.Display();
	}
}

public class Super_Use2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Realme r=new Realme();
               r.show();
	}

}
