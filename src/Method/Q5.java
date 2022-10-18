package Method;
//Write a program for class and object : (initialization through method) 
//Note : Initializing object simply means storing data into object 
public class Q5 {
    int num;
       void m1(int a) {
    	
    	   System.out.println(a);
    	   m2();
    	  
       }
       void m2() {
    	   System.out.println("m2");
//    	  System.out.println(num); 
       }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q5 obj=new Q5();
		obj.m1(5);

	} 

}
