package com.day20_Array;

import java.util.Scanner;

public class CharArrayReverseManner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		//accept array
		System.out.println("Enter the Array character :-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		
		//display array
		System.out.println("Your reverse Order is:-");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
