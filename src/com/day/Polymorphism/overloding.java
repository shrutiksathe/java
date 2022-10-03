package com.day.Polymorphism;
class A{
	int m1(int a) {
//		System.out.println(a);
		return a;
	}
	float m1(float a) {
		return a;
	}
}

public class overloding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A a=new A();
           int x=a.m1(2);
          float y=a.m1(2.3f);
          System.out.println(x+" , "+y);
          
	}

}
