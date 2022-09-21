package BasicTest1;

import java.util.Scanner;

public class MarksPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter subject 1 Mark: ");
		int s1=sc.nextInt();
		System.out.print("Enter subject 2 Mark: ");
		int s2=sc.nextInt();
		System.out.print("Enter subject 3 Mark: ");
		int s3=sc.nextInt();
		System.out.print("Enter subject 4 Mark: ");
		int s4=sc.nextInt();
		System.out.print("Enter subject 5 Mark: ");
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5;
    	int average=total/5;
		float per = (total/500f)*100f;
	
		System.out.println("Total of Marks: "+total);
		System.out.println("Average: "+average);
		System.out.println("Percentage: "+per);
		

	}

}
