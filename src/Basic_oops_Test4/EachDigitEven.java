package Basic_oops_Test4;
//WAP to find numbers between 100 and 400(both included) where each digit of number is an even number
public class EachDigitEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hellooo");
	 //int count=0;
		 for(int i=100;i<=400;i++) {
			 int num=i;
			 int count=0;
			   while(num>0) {
				  int r=num%10;
				   if(r%2==0) {
					   count++;
//					   if(count==3) {
//						   System.out.print(i+" ");
//					   }
					  
				   }
				   if(count==3) {
					   System.out.print(i+" ");
				   }
				   num=num/10;
				   
			   }
		 }

	}

}
