package com.day17_Inheritance;
class Animal{
	int legs=4;
}
class Dog extends Animal{
	void show() {
		System.out.println("Dog has "+legs+" legs");
	}
}


public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.show();

	}

}
