package Array_CRUD;
import java.util.Arrays;
import java.util.Scanner;



public class Student {
	int sid;
	String sname;
	int ncourse;
	
   Student(int sid,String sname,int ncourse){
	this.sid=sid;
	this.sname=sname;
	this.ncourse=ncourse;
 }
//   public void display() {
//       System.out.println("Student ID:- "+sid+"\n Student Name:- "+sname);
//   }
   
     public String toString() {
    	 return "Student ID:- "+sid+" Student Name:- "+sname+"\n";
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student sarr[]=new Student[2];
		
		for(int i=0;i<sarr.length;i++) {
			System.out.println("Enter Student ID:- ");
			int sid=sc.nextInt();
			System.out.println("Enter Student Name:- ");
			String sname=sc.next();
			System.out.println("Enter Number of Course:- ");
			int ncourse=sc.nextInt();
			sarr[i]=new Student(sid,sname,ncourse);
		}
		
		//disply
		
		System.out.println(Arrays.toString(sarr));    //first way
//		for(Student s:sarr) {                          //second way
//			System.out.println(s);
//		}
		

	}

}
