package com.day23_String;
import java.util.Scanner;
public class CharOccurance {
	
	public static void occurance(String s) {
		s=s.replace(" ","");
	
		char ch[]=s.toCharArray();
		
		int count=0;
		
		for(int i=0;i<ch.length;i++) {
			
			// check visited or not
			count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--) {
				if(ch[i]==(ch[k])) {
				isvisited=true;
				break;
				}
			}
			
			if(isvisited==false) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						count++;
					}
				}
			}
			if(isvisited==false) {
				System.out.println(ch[i]+"="+count);
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:-");
		String s=sc.nextLine();

        	occurance(s);	
		
	}

}
 
