package com.day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		//int a[]= {9,8,7,6,5,4,3,2,1};
/*		int a[]= {1,2,3};
		int j=a.length-1;
		System.out.println(a.length/2);
		for(int i=0;i<a.length/2;i++) {
			int b=a[i];
			a[i]=a[j];
			a[j]=b;
			j--;
		}
		System.out.println(Arrays.toString(a)); */
		
		
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter array elemnent:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//array reverse logic
		int j=arr.length-1;
		
		for(int k=0;k<arr.length/2;k++) {
			int b=arr[k];
			arr[k]=arr[j];
			arr[j]=b;
			j--;
		
	}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
