package com.day18_Abstract;


abstract class Test1{
	public abstract void m1();
	protected abstract void m2();
	//private abstract void m3();
	
}


public class Test2 extends Test1 {
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
