package com.day_Exception_Overriding;


class Animals{
	// rule 2 parent declare exception
	public void run() throws ArithmeticException{
		
	}
	
}
class Dogs extends Animal{
	// rule 2 child not declare exception is allow
//	public void run() throws Exception {
//		
//	}
	
	public void run() throws ArithmeticException {
	
}
	
}

public class Rule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
