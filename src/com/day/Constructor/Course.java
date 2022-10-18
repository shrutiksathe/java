package com.day.Constructor;

import java.util.Arrays;

class SubCourse{
	int subCourseId;
	String subCourseName;
	SubCourse(int subCourseId,String subCourseName){
		this.subCourseId=subCourseId;
		this.subCourseName=subCourseName;
//	   System.out.println("SubCourse constructor");
//	   System.out.println(subCourseId+" "+subCourseName);
	}
}
public class Course {
	int id;
	String name;
	SubCourse sc;
	Course(int id,String name,SubCourse sc){
		System.out.println(id+" "+name+" "+sc.subCourseId+" "+sc.subCourseName);
		System.out.println("Course Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SubCourse sc=new SubCourse(1,"Html");// obj subcourse
       Course obj=new Course(123,"Full Stack",sc); 
	}

}
