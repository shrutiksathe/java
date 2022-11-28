package com.day20_Array;

import java.util.Scanner;

public class PrimeArray {
    public static void checkPrime(int a[]) {
    	for(int i=0;i<a.length;i++) {
    		int count=0;
    		  for(int j=1;j<=i;j++) {
    			      if(a[i]%j==0) {
    			    	 break;
    			      }
    			      else {
    			    	  System.out.println(a[i]);
    			      }
    		  }
//    		  if(count==2) {
//    			  System.out.println(a[i]);
//    		  }
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array Element:- ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		PrimeArray.checkPrime(arr);

	}

}
