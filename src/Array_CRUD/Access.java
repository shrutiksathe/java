package Array_CRUD;

import java.util.Arrays;
import java.util.Scanner;

class Course{
	int cid;
	String cname;
    String duration;
	
	public Course(int cid,String cname,String duration) {
		this.cid=cid;
		this.cname=cname;
		this.duration=duration;
	}
	
}
class Student1{
	int sid;
	String sname;
	Course crs[];
	
	//public Student1() {}	
	public Student1(int sid,String sname,Course crs[]) {
		this.sid=sid;
		this.sname=sname;
		this.crs=crs;
	}
	public String toString() {
		return "Student ID: "+sid+" "+"Student name: "+sname;// +"\n "+Arrays.toString(crs);
	}
	public static void getArray(Student1 std[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the id for details: ");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++) {
			if(std[i].sid==id) {
				System.out.println(std[i]);
			}
		}
	}
	public static void getUpdate(Student1 std[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the id for update:");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++) {
			Course s[]=std[i].crs;
			if(std[i].sid==id) {
				for(int j=0;j<s.length;j++)
				{
//					s[j].cname=".Net";
					System.out.println("Enter new name:-");
					String newname=sc.next();
					std[i].sname=newname;
				}
				
			}
			System.out.println(std[i]);
		}
	}
	public static void getDelete(Student1 std[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the id for delete:");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++) {
			if(std[i].sid==id) {
				std[i]=null;
			}
			System.out.println(std[i]);
		}
	}
}
	
public class Access {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Student1 std[]= new Student1[2];

		for(int i=0;i<std.length;i++) {
			System.out.println("Enter the Student ID");
			int sid=sc.nextInt();
			System.out.println("Enter the Student Name");
			String sname=sc.nextLine();
			System.out.println("Enter the number of courses:");
			int countCourse=sc.nextInt();
			Course cArr[] = new Course[countCourse];
			for(int j=0;j<cArr.length;j++) {
				System.out.println("Enter the course id: ");
				int cid=sc.nextInt();
				System.out.println("Enter the course name: ");
				String cname=sc.next();
				System.out.println("Enter the course duration");
				String cduration=sc.next();
				cArr[j]= new Course(cid,cname,cduration);
			}
			std[i]= new Student1(sid,sname,cArr);
			}
		for(Student1 s:std) {
			System.out.println(s);
		}
		Student1.getArray(std);
		Student1.getUpdate(std);
		
		System.out.println("/////////////////////////////");
		for(Student1 s:std) {
			System.out.println(s);
		}
		
		Student1.getDelete(std);


	}

}
