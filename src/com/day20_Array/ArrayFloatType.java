package com.day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFloatType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array:-");
		 int size=sc.nextInt();
		 
		  float a[]=new float[size];
		  //accept
		  System.out.println("Enter the Array Elements:- ");
		  for(int i=0;i<a.length;i++) {
			  a[i]=sc.nextFloat();
		  }
		//display 
		  //method 1
		  for(int i=0;i<a.length;i++) {
			  System.out.println(a[i]);
		  }
		  //method 2 by using Inhance for loop
		  System.out.println("----Inhance for loop-----");
		  for(float x:a) {
			  System.out.println(x);
	}
		  //method 3 by using toString method
		  System.out.println("-----toString method-----");
		  System.out.print(Arrays.toString(a));

	}

}
