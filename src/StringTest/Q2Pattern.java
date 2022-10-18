package StringTest;
import java.util.Scanner;
//String s="India is my country" create patteren using String and  insert @ inseted of i/I
//@nd@a 
//@nd@a @s 
//@nd@a @s my 
//@nd@a @s my country


public class Q2Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		String s="india is my country";
		s=s.replace("i", "@");
		String st[]=s.split("\\s");
		
		for(int i=0;i<st.length;i++) {
			 for(int j=0;j<=i;j++) {
				 System.out.print(st[j]+" ");
			 }
			 System.out.println();
		}
		
		
		

	}

}
