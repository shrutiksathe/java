package com.day13;

public class demo2 {
	int width;
	int hight;
	int length;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x,y,z;
//		x=0;
//		y=1;
//		x=y=z=8;
//		System.out.println(x++ -y*2 + ++z - --y);
		
//		int i=0;
//		for(i=1;i<=6;i++) {
//			if(i%3==0)
//				continue;
//			System.out.println(i+",");
		demo2 obj1=new demo2();
		demo2 obj2=new demo2();
		obj1.hight=1;
		obj1.length=2;
		obj1.width=1;
		obj2=obj1;
		System.out.println(obj2.hight);
		
		
		}

	}


