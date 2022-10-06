package ArrayTest_1D;
import java.util.Scanner;
public class Replace_0_with_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:-");
		int size =sc.nextInt();
		//Array
		int arr[]=new int[size];
		//accept array elemnt
		System.out.println("Enter The array elementt:-");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	    }
		//lopgic to replace o with 1
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("1");
			}
			else {
				System.out.println(arr[i]);
			}
		}
		
		

	}

}
