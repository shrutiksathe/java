package com.day15_Static;

public class MyEmp {
	//int x=0;     o/p- 1 1 1
	static int x=0;   //o/p - 1 2 3   used same memory obj
	MyEmp(){
		x++;
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmp obj=new MyEmp();
		MyEmp obj2=new MyEmp();
		MyEmp obj3=new MyEmp();
		

	}

}
