package com.day18_Abstract;

abstract class Animal{
	abstract void m1();
	Animal(int a){
		System.out.println("constructor a");
	}
}
class Dog extends Animal{
	Dog(int d){
		super(5);
	}
void m1() {
		
		System.out.println("M1 method");
	}
}

public class AbstractCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog(6);
		obj.m1();

	}

}
