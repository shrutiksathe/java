package com.day18_Abstract;
abstract class A{
	abstract void m1();
	///////////////////
	 int n=10;   // variable
	 /////////////////
	void m2() {    // non abstract method
		System.out.println("M2");
	}
	///////////////////
	abstract void m3();//abstract method
	//////////  //constructor
	 A(){
		System.out.println("COnstructor");
	}
	
}
class B extends A{
     void m1() {
		System.out.println("M1 method"+n);
	}
	public void m3()
	{
		System.out.println("m3");
	}
}
public class Test {
         void m() {
        	 System.out.println("Instance block");
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static block");
		Test t=new Test();
		t.m();
		B obj=new B();
		obj.m1();
		obj.m3();
		
		
		

	}

}
