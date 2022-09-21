package com.day11;

import java.util.Scanner;

public class Vehical {
	int model_no;
	String name;
	int price;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vehical obj=new Vehical(); obj.model_no=123; obj.name="Splender";
		 * obj.price=80000; //System.out.println(obj.model_no+
		 * " "+obj.name+" "+obj.price);
		 * 
		 * obj.model_no=124; obj.name="Activa"; obj.price=90000;
		 * System.out.println(obj.model_no+ " "+obj.name+" "+obj.price);
		 */
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=2;i++)
		{
			Vehical obj=new Vehical();
			System.out.println("enter id");
			obj.model_no=sc.nextInt();
			System.out.println("enter name");
			obj.name=sc.next();
			System.out.println("enter the price");
			obj.price=sc.nextInt();
			
			System.out.println(obj.model_no+ " "+obj.name+" "+obj.price);
		}

	}

}
