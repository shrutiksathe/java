package OOPS_Test_5;

import java.util.*;

/* National game of India is Hockey, China is Table Tennis, Bangladesh is Kabaddi, Italy is Football,
United States is baseball. Write a Java program to read country name as user-input and to print the
country’s national game. Use switch */

public class Q14_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter choice Name:-");
          String choice=sc.next();
          
          switch (choice) {
          case "hockey": System.out.println("India");
          break;
          case "Kabaddi": System.out.println("Bangladesh");
          break;
          case "Tennis": System.out.println("china");
          break;
          case "football": System.out.println("Italy");
          break;
          case "baseball": System.out.println("United States");
          break;
          default:System.out.println("Invalid choise");
          }
           
	}

}
