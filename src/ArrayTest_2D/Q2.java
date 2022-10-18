package ArrayTest_2D;
//2.	WAP to create a array of 10 elements and swap first two elements with last two elements.0
import java.util.Arrays;


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a[]= {1,5,3,4,6,7,2};
            for(int i=0;i<a.length;i++) {
            	int temp;
            	for(int j=1;j<a.length-1;j++) {
            		temp=a[i];
            		a[i]=a[j];
            		a[j]=temp;
            	}
            }
            System.out.println(Arrays.toString(a));
	}

}
