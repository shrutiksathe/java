package com.day20_Array;

import java.util.Scanner;

public class AvgOddElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Array Size:-");
		int size=sc.nextInt();
		int arr[]=new int[size];
	//Accept array Elmet
		System.out.println("Enter your array Elemnt:-");
		for(int i=0;i<arr.length;i++) {
	            arr[i]=sc.nextInt();		
		}
     //
		int sum=0,count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
//				System.out.println(arr[i]);
				  count++;
				 sum=sum+arr[i];
			}
		}
		int avg=sum/count;
		System.out.println("your Average of odd element is:- "+avg);
	}

}
