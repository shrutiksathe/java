package com.day20_Array;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // 1st way:- Create and direct initialize int a[]= {1,2,3,4,5};
		 * /////////////////////////////////////////////////////////////// //2nd way:-
		 * //1st create int b[]; // create //2nd initialize b=new int[5];
		 * //////////////////////////////////////////////////////////////////
		 */		 
		 //3rd way:-
		  int c[]=new int[5];
//		  c[0]=1;
//		  c[1]=2;
//		  c[2]=8;
//		  c[3]=3;
//		  c[4]=9;
//		  c[5]=10;
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter your Array Elements:-");
		  for(int i=0;i<c.length;i++) {
			  c[i]=sc.nextInt(); //accept in array
		  }
		  System.out.println("Your Array Elemt:----");
		  for(int i=0;i<c.length;i++) {
			  System.out.println(c[i]);
		  }
		  
		  
	    //  System.out.println(c[2]);

	}

}
