package com.day20_Array;
import java.util.Scanner;
public class ArrayAvg_ByMethod {
	public void Avg(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Avg= "+(sum/a.length));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  
		ArrayAvg_ByMethod obj=new ArrayAvg_ByMethod();
		
	     int arr[]=new int[5];
		System.out.println("Enter array Elemnt:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		obj.Avg(arr);

	}

}
