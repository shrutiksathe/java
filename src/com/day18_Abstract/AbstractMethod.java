package com.day18_Abstract;
abstract class q{
	public abstract void m1(); //higher visibility public
}
class r extends q{
	public void m1() {          // lower visibility
		System.out.println("m1");
	}
}


public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	}

}
