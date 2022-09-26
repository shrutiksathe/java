//Create a one abstract class which contains one integer type of variable create one interface which contain
// one int type of variable and in a child class prefer the addition of abstract class variable and interface 
// variable
package com.day18_Abstract;

interface Showable {
	int b=3;
}
 class Vehical implements Showable{
	int a=2;
	void show() {
		int sum=a+b;
		System.out.println(sum);
	}
	
}
 public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehical v=new Vehical();
      System.out.println(v);
      v.show();
	

}
}