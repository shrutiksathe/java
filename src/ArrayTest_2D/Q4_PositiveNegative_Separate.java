package ArrayTest_2D;
//4.	How to rearrange array in alternating positive and negative number[2]
//Input: {1, 2, 3, -4, -1, 4}
//Output: {-4, 1, -1, 2, 3, 4}

public class Q4_PositiveNegative_Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,2,3,-4,-1,4};
         
         int j=0;
         for(int i=0;i<a.length;i++) {
        	 if(a[i]<0) {
        		 if(j!=i) {
        			 int temp=a[i];
        			 a[i]=a[j];
        			 a[j]=temp;
        		 }
        		 j++;
        	 }
         }
         for(int i=0;i<a.length;i++) {
        	 System.out.print(" "+a[i]);
         }
	}

}
