package Test_5_11_2022;

import java.util.Arrays;
import java.util.*;

//13.	Employee class is as follows . 
// Employee {
//int empno ; 
//String name ;
//Department dept ;
//}
//Where dept is object of department class. 
//Department class as deptId and deptname.
//Write a program to create array of 3 employees. 
//Each employee will have different department. 

class Department{
   int deptId;
   String deptname;
   Department(int did,String dname){
	   this.deptId=did;
	   this.deptname=dname;
   }
}
class Employee{
	int empno;
	String name;
	Department dept;
	
	Employee(int empno,String ename ,Department d){
		this.empno=empno;
		this.name=ename;
		this.dept=d;
	}
	
	//display
	public String toString() {
		return "Emp No:-"+empno+" Emp Name:-"+name+" Dept Id:-"+ dept.deptId+ "Dept name:-"+dept.deptname;
	}
}
public class Q13_Employee_Dept_ArrayObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[]=new Employee[3];
	     Scanner sc=new Scanner(System.in);
	     for(int i=0;i<arr.length;i++) {	
		
		  System.out.println("Enter empno:- ");
		  
		  int empno=sc.nextInt();
		
	    System.out.println("Enter ename:- ");
		 String ename=sc.next();
		
		System.out.println("ENter Department Id:-");
		int did=sc.nextInt();
		
		System.out.println("ENter Department Name:-");
		String dname=sc.next();
		

	    Department d=new Department(did,dname);
		arr[i]=new Employee(empno,ename,d);
	}
	     //display
	 // System.out.println(Arrays.toString(arr)); 
	     for(int j=0;j<arr.length;j++) {
	    	 System.out.println(arr[j]);
	     }

	
	}

}
