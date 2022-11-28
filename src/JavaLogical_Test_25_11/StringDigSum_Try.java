package JavaLogical_Test_25_11;

import java.util.Scanner;

public class StringDigSum_Try {
	public static void digiSum(String s) {
		
		char ch[]=s.toCharArray();
		int sum=0;
		
		for(int i=0;i<ch.length;i++) {
		    // for(int j=0;j<ch.length;j++) {
			 int n=0;
		    	 if(ch[i]>='0' && ch[i]<='9') {
		    		  for(int j=i+1;j<ch.length;j++ ) {
		    			  if(ch[j]>='0' && ch[j]<='9') {
		    				  
		    		      n=Integer.valueOf(String.valueOf(ch[i])+String.valueOf(ch[j]));
		    			  }
		    			  else if(ch[j]>='a' && ch[j]<='z') {
		    				  n=Integer.valueOf(String.valueOf(ch[i]));
		    				  // break;
		    				}
		    			  System.out.println(n);
		    			 // sum=n+sum;
		    			  
		    		  }
		    	 }
		     }
		System.out.println(sum);

		  
			}
			
		//}
		
		
			
	
  
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String:-");
		String s=sc.next();
		digiSum(s);
		

	}

}
