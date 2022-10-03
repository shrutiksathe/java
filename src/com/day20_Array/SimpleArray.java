package com.day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {4,5,7,8,9};
//		System.out.println(arr[3]);
		
		// array create and memory allocation
		int a[]=new int[5];
//		a[0]=23;
//		a[1]=20;
//		a[2]=19;
//		a[3]=12;
//		a[4]=9;
//		
//		 System.out.println(a[3]);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:-");
		//accept the array from user
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();   //accept
		}
		//Display 
		System.out.println("--display array1--");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		System.out.println("--display array2 using inhance for loop--");
		for(int x:a) {
			System.out.println(x+" ");
		}
		
		System.out.println("--Display array3 using toString method");
		 System.out.print(Arrays.toString(a));
		
		
		
		

	}

}
