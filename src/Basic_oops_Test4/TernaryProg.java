package Basic_oops_Test4;

import java.util.Scanner;

// rewrite the following program segment using Ternary statement
//  if(sale>15000)
//	  comm=sale*5/100;
//  else
//	comm=0.0;
public class TernaryProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int sale=sc.nextInt();
     double comm;
     comm=(sale>15000)?(sale*5/100):(0.0);
     System.out.println(comm);
	}

}
