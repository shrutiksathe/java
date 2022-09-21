package com.day02;

public class Operator {

	public static void main(String[] args) {
		
//		int x=20;
//		x++; //post increment
//		//++x; // pree increment
//		
//		System.out.println(x);// print 21
//		System.out.println(++x);// print 22
//		System.out.println(x++);//print 22
//		System.out.println(x);//print 23
		
//		int a,b;
//		a=10;
//		b=10;
//		//1
//		int x = ++a + b++;                  // x = 11 + 10
//		System.out.println(x+" "+a+" "+b); // x=21  , a=11   ,b=11
//		
//		//2
//		 x= a++ + --b -a;
//		 System.out.println(x+" "+a+" "+b); //x=9, a=12, b=10
		 
//---------Example 2---------------------------------------------------------------
		int a=2;
		int b=2;
		int x = a++ + b++;
		System.out.println(x+" "+a+" "+b);  //4 3 3
		
		//2
		x = ++a - ++b;
		System.out.println(x+" "+a+" "+b); //0 4 4
		
		//3
		x = --a - b++;
		System.out.println(x+" "+a+" "+b); //-1 3 5
		
		//4
		x = a++ - --b - b;
		System.out.println(x+" "+a+" "+b);//-5 4 4
		
		//5
		x = ++b - --a - --b;
		System.out.println(x+" "+a+" "+b);//-2 3 4
		
		
		}
}
