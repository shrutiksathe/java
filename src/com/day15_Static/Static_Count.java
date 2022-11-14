package com.day15_Static;

public class Static_Count {
	static int count;  // 1 2 3
	//int count;//1 1 1
	
	Static_Count(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Count o=new Static_Count();
		Static_Count o1=new Static_Count();
		Static_Count o2=new Static_Count();
		

	}

}
