package com.day04;

import java.util.Scanner;

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Rectangle \n Square \n Circle \n Triangle");
		System.out.print("Enter your choice: ");
		String choice=sc.next();
		
		
		switch(choice) {
		case "Rectangle" : 
			System.out.print("Enter Length : ");
			int l=sc.nextInt();
			System.out.print("Enter Breadth : ");
			int b=sc.nextInt();
			int area=l*b;
			System.out.println("The area of Rectangle is : "+area);
		break;
		
		case "Square":
			System.out.print("Enter sides : ");
			int s=sc.nextInt();
			int square=s*s;
			System.out.println("The area of Squar is : "+square);
		break;
			
		case "Circle":
			System.out.print("Enter Radius :");
			int r=sc.nextInt();
			double circle=3.14*r*r;
			System.out.println("The are of circle is :"+circle);
		break;
		
		case "Triangle":
			System.out.print("Enter hight: ");
			int height=sc.nextInt();
			System.out.print("Enter base: ");
			int base=sc.nextInt();
			int triangle=(base*height)/2;
			System.out.println("The area of triangle is : "+triangle);
		break;
		
		default:System.out.println("invalid..");
		}
		
		}
}
