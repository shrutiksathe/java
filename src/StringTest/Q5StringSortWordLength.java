package StringTest;
import java.util.Arrays;

//5.	How to sort String on their length.
//E.g. I Love UK Country
//Output -Country Love UK I


import java.util.Scanner;
public class Q5StringSortWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array int descending
//		int arr[]=new int[5];
//		Scanner sc=new Scanner(System.in);
//		     // accept
//		System.out.println("ENter Array 5 element :-");
//		 for(int i=0;i<arr.length;i++) {
//			 arr[i]=sc.nextInt();
//		 }
//		  int temp=0;
//		    //logic descending  4 5 9 3 1
//		  for(int i=0;i<arr.length;i++) {
//			  for(int j=i+1;j<arr.length;j++) {
//				   if(arr[i]<arr[j]) {
//					  temp=arr[i];
//					  arr[i]=arr[j];
//					  arr[j]=temp;
//				   }
//			  }
//		  }
//		  
//		  //display output
//		  System.out.println(Arrays.toString(arr)); //o/p 9 5 4 3 1
//		
		
		
		//String 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:- ");
		String str=sc.nextLine();
		
		String s[]=str.split("\\s");
	  
		String word;
		for(int i=0;i<s.length;i++) {
			for( int j=i+1;j<s.length;j++) {
				if(s[i].length()<s[j].length()) {
					word=s[i];
					s[i]=s[j];
					s[j]=word;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(s));
		
	
		
		
		
		
		
		

	}

}
