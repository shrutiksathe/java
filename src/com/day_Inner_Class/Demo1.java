package com.day_Inner_Class;

public class Demo1 {        // outer class
	private int x=10;
	class Inner{
		void display() {
			System.out.println("X outer="+x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 out=new Demo1(); //  outer class obj creation
		Demo1.Inner in=out.new Inner();// inner class obj creation
		in.display();

	}

}
