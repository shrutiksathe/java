package Task;
import java.util.Arrays;
import java.util.Scanner;   //PASSword     4dro6
public class Password {
	public static void check(String s[],String ck) {
		
		//check string
	  // char c[]=ck.toCharArray();
	    int ul=Character.getNumericValue(ck.charAt(0));
		int sum=Character.getNumericValue(ck.charAt(ck.length()-1));
		
	//	-----------------------------------
//		char checkArray[]=ck.toCharArray();
    	String checkstring="";
	  
//		 for(int i=1;i<ck.length();i++) {
//			 System.out.println(ck.charAt(i));
//			 checkstring=checkstring+Character.toString(ck.charAt(i));
//		 }
    	
    	checkstring=Character.toString(ck.charAt(3))+
    			    Character.toString(ck.charAt(2))+
    			    Character.toString(ck.charAt(1));
    	
    	
		 
		// System.out.print(checkstring);     //
		 char cs[]=checkstring.toCharArray();
//		-------------------------
		
		
		//System.out.println(ul+" "+sum); //
//		int count=0;
//		int digitsum=0;
//		int i;
		  for(int i=0;i<s.length;i++) {
			  char pass[]=s[i].toCharArray();
			   
			
			  // upper case check
			    int count=0;
			    for(int p=0;p<pass.length;p++) {
			    	if(pass[p]>='A' && pass[p]<='Z') {
			    	
			    		count++;
			    	//	System.out.println("count"+count);
			    	 }
			     }
			  
			 // Digit sum
			    int digitsum=0;
			    for(int j=0;j<pass.length;j++) {
		    		  if(pass[j]>='1' && pass[j]<='9') {
		    			  digitsum=digitsum+Character.getNumericValue(pass[j]);
		    		  }
		    	  }
			    //lastword
			    // boolean istrue=false;
			     int ct=0;
			    for(int k=0;k<pass.length;k++) {
			    	 for(int m=0;m<cs.length;m++) {
			    	 if(pass[k]==cs[m]) {
			    		// istrue=true;
			    		 ct++;
			    	 }
			    	
			    	 }
			    }
			    
			    
			    
			    //
			    if(count==ul) {
			    	//System.out.println("Upper true"+count);
			    	 
			    	  if(digitsum==sum) {
			    		 // System.out.println("Digit condition true"+digitsum);
			    	       // System.out.println(s[i]);
			    	         
			    	        //lastword
			    	        if(ct==3) {
			    	        	System.out.println(s[i]);
			    	        }
			    	  }
			    }
			     
			  }//i 
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 String s[]=new String[3];
		 System.out.println("Enter the 3 Password:-");
		 for(int i=0;i<s.length;i++) {
			 s[i]=sc.next();
		 }
		 System.out.println("Enter check String:-");
		 String ck=sc.next();
		 
		 
		 Password.check(s, ck);
		 
         
	}

}
