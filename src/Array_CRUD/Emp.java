package Array_CRUD;
import java.util.Scanner;
public class Emp {
        int eid;
        String name;
	public Emp(int empid, String name) {
		// TODO Auto-generated constructor stub
		this.eid=empid;
		this.name=name;
	}
	void display() {
		System.out.println(eid+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc=new Scanner(System.in);
             Emp e[]=new Emp[2];
             
             for(int i=0;i<e.length;i++) {
            	 System.out.println("ENter Emp Id:-");
            	 int empid=sc.nextInt();
            	 System.out.println("ENter Emp name:- ");
            	 String name=sc.next();
            	 e[i]=new Emp(empid,name);
            	 }
	}

}
