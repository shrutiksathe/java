package com.day18_Abstract;

 abstract class S{
	S(){
		System.out.println("Parent abstract constructor ");
	}
}
class P extends S{
//	P(char c){
//		//super(4);
//		System.out.println("child constructor");
//	}
	void m1() {
		System.out.println("M1 method");
	}
}
public class AbstractConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             P obj=new P();
             obj.m1();
             
	}

}
