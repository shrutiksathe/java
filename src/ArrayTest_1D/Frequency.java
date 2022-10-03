package ArrayTest_1D;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'a','b','a','b','c'};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			boolean isvisible=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[i]==arr[k]) {
					isvisible=true;
					break;
				}
				if(isvisible=false) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]==arr[j]) {
							count++;
						}
					}
				}
			}
		}

	}

}
