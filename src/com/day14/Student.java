package com.day14;

public class Student {
	int sid;
	String name;
	int total;
	double per;
	Student(int sid,String name)
	{
		this.sid=sid;
		this.name=name;
	}
	Student(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		this(101,"shrutik");
		total=m1+m2+m3+m4+m5+m6;
		per=(total*100)/600;
	}
	Student()
	{
		this(75,74,78,79,76,75);
		System.out.println(sid+" "+name+" "+per);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();

	}

}



