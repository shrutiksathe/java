package StringTest;
//How to remove Characters from the first String which are present in the second
//String.
//e.g String1-india is great nation.
//string2-in
//output-da s great ato


import java.util.Scanner;

public class Q8_deletecharchter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter Second String ");
		String s2=sc.nextLine();
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			int count=0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==(c2[j])) {
					count++;
					
				}
			}
			if(count==0) {
				System.out.print(c1[i]);
			}
		}

	}

}
