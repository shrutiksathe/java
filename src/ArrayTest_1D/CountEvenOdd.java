package ArrayTest_1D;

import java.util.Scanner;

public class CountEvenOdd {
	int evencount=0, oddcount=0;
	
	public void evenOdd(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evencount ++;
			}
			else if(a[i]%2!=0) {
				oddcount ++;
			}
		}
		System.out.println("Total Even count is:-"+evencount);
		System.out.println("Total Odd count is:-"+oddcount);
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size:-"); // accept array size
		int size=sc.nextInt();
		
		int arr[]=new int[size];                      // array
		
		System.out.println("Enter the array element:-");
		for(int i=0;i<arr.length;i++) {                   //accept element 
			arr[i]=sc.nextInt();
		}
		
		CountEvenOdd obj=new CountEvenOdd();
		obj.evenOdd(arr);
		
		
		
		

	}

}
