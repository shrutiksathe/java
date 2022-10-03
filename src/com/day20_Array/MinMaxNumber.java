package com.day20_Array;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array 5 element:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
	

	}

}
