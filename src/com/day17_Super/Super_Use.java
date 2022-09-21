// Super is reference keyword and used to refer the parent class object
//uses:-
//1)super can be used to refers the parent class instance variable
//2)super can be used to invoke the parent class method
//3)super can be used to invoke the parent class constructor

package com.day17_Super;
class Animal{
	 String color="white";
}
class Cat extends Animal{
	 String color="black";
	 void show() {
		 System.out.println("Animal :-"+super.color);
		 System.out.println("Cat :- "+color);
	 }
}
public class Super_Use {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
         Cat d=new Cat();
         d.show();
	}

}
