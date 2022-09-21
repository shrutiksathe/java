package com.day11;

import java.util.Scanner;

//create a one method accept one integer type parameter print the sum of factor of given parameter

public class Test {
	
	int sum=0;
	public void accept(int n) {
		
		for(int i=1;i<=n;i++) {
			 if(n % i==0 ) {
				  sum=sum+i;
		  }
	}
		System.out.println(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Test obj=new Test();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      obj.accept(n);
	}

}
