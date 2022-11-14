package com.day15_Static;

 class Student {
	
	int roll;
	String name;
	static String college_name="DY";
	
	static void m() {
		//System.out.println(roll);  //not access non static member
		System.out.println(college_name);
	}
	
	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
		//this.college_name=cname;
	}
	
	void display() {
		System.out.println(roll+" "+name+" "+college_name);
	}
}

public class Static_Variable{
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s=new Student(1,"shrutik");
		Student s1=new Student(2,"Pratik");
	//	Student.college_name="SSPU";
		s.display();
		s1.display();
		
		

	}

}
