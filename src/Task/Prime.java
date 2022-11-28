package Task;
import java.util.Scanner;
public class Prime {
	public static void checkPrime(int a[]){
		
	     for(int i=0;i<a.length;i++){
	    	 int count=0;
	               for(int j=1;j<=a[i];j++){
	                    if(a[i]%j==0){
	                       count++;
	                    	
	                     }
	                }
	                 if(count==2) {
	            	   System.out.println(a[i]);
	               }
	         }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    int a[]=new int[5];
		   for(int i=0;i<a.length;i++){
		         a[i]=sc.nextInt();
		     }
		    
		    Prime.checkPrime(a);

	}

}
