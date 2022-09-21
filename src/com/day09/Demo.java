package com.day09;
//print table between 1 to 5 number

public class Demo {
	public static void main(String[] args) {
		int num = 1;
		System.out.println("Tables");
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 10; i++) {
				num = i * j;
				System.out.println(num);

			}
			System.out.println("/////////////////////////////////////////////////");

		}
	}
}
