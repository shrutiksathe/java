package com.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInfo { 
	
	int id;
	String name;
	int[] marks;
	
	StudentInfo(int id,String name,int[] marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {                    // to Display 
		return id+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo st[]=new StudentInfo[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<st.length;i++) {
			System.out.println("Enter the id:-");
			int sid=sc.nextInt();
			System.out.println("Enter the Name:-");
			String sname=sc.next();
			int mk[]=new int[3];
			for(int j=0;j<mk.length;j++) {
				System.out.println("Enter the marks:-");
				mk[j]=sc.nextInt();
			}
			st[i]=new StudentInfo(sid,sname,mk);
			
		}

	}

}
