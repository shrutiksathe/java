package JavaLogical_Test_25_11;
import java.util.Arrays;
import java.util.Scanner;

public class Q12_CommanChar {
	
	   public static void check(String s1,String s2) {
		   char ch1[]=s1.toCharArray();
		   char ch2[]=s2.toCharArray();
		   String str="";
		   for(int i=0;i<ch1.length;i++) {
			   
			     
			   for(int j=i;j<ch2.length;j++) {
				   if(ch1[i]==ch2[j]) {
					   str=str+Character.toString(ch1[i]);
				   }
			   }
		   }
		   char st[]=str.toCharArray();
		   
//		   for(int i=0;i<st.length;i++) {
//			   for(int j=i+1;j<st.length;j++) {
//				   if(st[i]==st[j]) {
//					   
//				   }
//			   }
//			   
//		   }
		   Arrays.sort(st);
		    
		   System.out.println(Arrays.toString(st));
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String 1:-");
		String s1=sc.nextLine();
		System.out.println("ENter the String 2:-");
		String s2=sc.nextLine();
           
		check(s1,s2);
	}

}
