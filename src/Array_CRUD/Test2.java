package Array_CRUD;
import java.util.Arrays;
import java.util.Scanner;

class Students{
	int sid;
	String name;
	
	Students(int id,String name){
		this.sid=id;
		this.name=name;
	}
	
	public String toString() {
		return "Student ID is:- "+sid+" Student Name is:- "+name;
	}
	
	
	static void update(Students std[] ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the id for update:");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++) {
			
			if(std[i].sid==id) {


					System.out.println("Enter new name:-");
					String newname=sc.next();
					std[i].name=newname;

				
			}
			System.out.println(std[i]);
		}
	}
	 static void delete(Students std[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Id for delete:");
		int id=sc.nextInt();
		for(int i=0;i<std.length;i++) {
			if(std[i].sid==id) {
				std[i]=null;
			}
		System.out.println(std[i]);
		}
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Students[] arr=new Students[2];
		
		//accept data from user
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("Enter Student Id:-");
//			int sid=sc.nextInt();
//		
//			System.out.println("Enter Student Name:-");
//			String sname=sc.next();
//			
//			arr[i]=new Students(sid,sname); //pass by cons
//		}
//		//display data
//		for(Students s:arr) {
//			System.out.println(s);
//		}
		System.out.println("...Menu...");
		System.out.println("1. Create \n2. Read \n3. Update \n4. Delete ");
	  int choice;
	do {	
		System.out.println(".........ENter the choice..........");
		 choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("...Create student info...");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter Student Id:-");
				int sid=sc.nextInt();
			
				System.out.println("Enter Student Name:-");
				String sname=sc.next();
				
				arr[i]=new Students(sid,sname); //pass by cons
			}
			System.out.println("...Student info created...");
			break;
		case 2:
			System.out.println("...Read student Data...");
//			for(Students s:arr) {
//				System.out.println(s);
//			}
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
//			System.out.println(Arrays.toString(arr));
			break;
		case 3:
			  Students.update(arr);
			break;
		case 4:
			    Students.delete(arr);
			    
			break;
		default:System.out.println("Invalid Choice");
			
		
		}
	}while(choice !=0);	

	}

}
