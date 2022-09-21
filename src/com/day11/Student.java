package com.day11;

public class Student {
	int id;
	String name;
	int s1,s2,s3;
	float per;
	
	public void acceptDetails(int i,String nm,int s01,int s02,int s03) {
		id=i;
		name=nm;
		s1=s01;
		s2=s02;
		s3=s03;
		
	}
	public void percentage() {
		int sum=s1+s2+s3;
		 per=(sum*100)/300;
		
	}
	public void display() {
		System.out.println(id+" "+name+" "+s1+" "+s2+" "+s3+" "+per);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.acceptDetails(101,"shrutik",80,75,82);
		obj.percentage();
		obj.display();
		

	}

}
