package com.day18_Final;
class Calculation{
	
	 final int add(int x,int y) {
		return x+y;
	}
	 final int add(int x,int y,int z) {
		 return x+y+z;
	 }
}

public class Final_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Calculation c=new Calculation();
     System.out.println(c.add(2, 2));  
       System.out.println(c.add(2, 2,2));
      }

}
