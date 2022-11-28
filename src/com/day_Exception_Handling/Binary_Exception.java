package com.day_Exception_Handling;

import java.util.Scanner;

class BinaryException extends Throwable {
	BinaryException(String s) {
		super(s);
	}
}

public class Binary_Exception {
	public static void check(int n) throws BinaryException {
		while (n > 0) {
			int r=n%10;
			if(r>=2) {
				throw new BinaryException("Not binary");
			}
			n = n / 10;
			}
		}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Number:-");
		int n = sc.nextInt();
		try {
			check(n);
		} catch (BinaryException e) {
			System.out.println(e.getMessage());
		}

	}

}
