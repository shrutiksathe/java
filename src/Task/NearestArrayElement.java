package Task;
import java.util.Arrays;
import java.util.Scanner;
public class NearestArrayElement {
	public static void check(int a[],int n) {
		
		for(int i=0;i<a.length;i++) {
			int temp=0;
		   for(int j=i+1;j<a.length;j++) {
			   if(a[j]>a[i]) {
			       temp=a[i];
			      a[i]=a[j];
			      a[j]=temp;
		      }
		   }
		}
		System.out.println(Arrays.toString(a));
		for(int j=0;j<a.length;j++) {
		if(n==a[j]) {
			System.out.println(a[j+1]);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter check Element:-");
		int n=sc.nextInt();
		
		check(a,n);
       
	}

}
