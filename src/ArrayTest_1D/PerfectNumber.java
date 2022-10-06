package ArrayTest_1D;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,43,25,49,12,9,78};
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==j*j) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
