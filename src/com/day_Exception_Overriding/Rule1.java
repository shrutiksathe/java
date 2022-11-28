package com.day_Exception_Overriding;

class Animal{
	// rule 1- parent does not declare any exception
	public void run() {
		
	}
	
}
class Dog extends Animal{
	//rule 1- child also not declare any exception or only declare 
	//uncheck type excep
	
	//@Override
//	public void run() throws NullPointerException{  // allowed
//		
//	}
	
	
//	public void run() throws SQLException {  // error
//		
//	}
}

public class Rule1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
