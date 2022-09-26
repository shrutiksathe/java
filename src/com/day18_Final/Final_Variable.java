package com.day18_Final;

public class Final_Variable {
	  final int x=20;
	   void show() {
		   //x++;  // final variable not be changed
		   System.out.println(x);
	   }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Final_Variable c=new Final_Variable();
          c.show();
	}

}
