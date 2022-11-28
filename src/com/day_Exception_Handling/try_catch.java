package com.day_Exception_Handling;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		 try {
			 result=10/0;
		 }
//		 catch(ArithmeticException e){
//			 System.out.println(e);
//		 }
		 //or
		 
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 
		 System.out.println(result);
       System.out.println("end");
	}

}
