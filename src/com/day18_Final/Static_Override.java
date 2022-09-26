package com.day18_Final;
class Animal{
	
	static void show() {
		
		System.out.println("Animal");
	}
}
class Dog extends Animal{
	static  void show() {
		
		System.out.println("Dog is :");
	}
}


public class Static_Override extends Animal {
//	static void show() {
//		//super.show();  In Static super keyword not use
//		System.out.println("Child ");
//		
//	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Static_Override c=new Static_Override();
//		c.show();
        Dog.show();
         
	}

}
