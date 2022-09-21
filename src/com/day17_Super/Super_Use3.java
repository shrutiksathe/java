package com.day17_Super;
class Emp{
	Emp(){
		System.out.println("Emp Constructor");
	}
}
class Dep extends Emp{
	Dep(){
		super();
		System.out.println("Dep Constructor");
		
	}
}
public class Super_Use3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dep d=new Dep();
      
	}

}
