package com.day18_Abstract;

abstract class x{
	abstract void m1();
	abstract void m1(int a);
}
class y extends x{
	void m1() {
		System.out.println("M1");
	}
	void m1(int a) {
		System.out.println("m2");
	}
}
public class Abstractoverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		y obj=new y();
		obj.m1();
		obj.m1(8);

	}

}
