package ArrayTest_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Seperate_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:-");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter array Elment:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int pos=0;
		for(int i=0;i<arr.length;i++) {
			 if(arr[i]!=0) {
				 arr[pos]=arr[i];
				 pos++;
			 }
		}
		while(pos<arr.length) {
			arr[pos]=0;
			pos++;
		}
		System.out.println("Separate zeros Array:-"+Arrays.toString(arr));

	}

}
