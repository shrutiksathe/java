package ArrayTest_2D;

public class Q5_Zero_Seperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,0,2,9,0,0,4,3,0,4};
		int count=0;
		/*for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		while(count<a.length) {
			a[count]=0;
			count++;
		}*/
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		System.out.println(count);
		while(count<a.length) {
			a[count]=0;
			count++;
		}
		System.out.println(count);
	
		//result display
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}

	}

}
