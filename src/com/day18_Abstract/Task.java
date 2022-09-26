//write a program to create a abstract class and provide the implementation to abstract method
//inside the child class and show the uses of super keyword with parent and child
package com.day18_Abstract;
//parent
abstract class Fruit{
	  abstract void eat();
	  Fruit(){
		  System.out.println("Fruits....");
	  }
}
//child
class Apple extends Fruit{
	// method overriding 
	void eat() {
		 System.out.println("Fruits Apple");
	 }
	//cons
	 Apple(){
		 super(); //refer the parent obj
	 }
}
public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Apple a=new Apple();
       a.eat();
	}

}
