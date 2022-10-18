package ArrayTest_2D;
//3.	WAP to find frequency/count of each element in 1D array.
public class Q3_FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,3,3,2,3,1,4};
		for(int i=0;i<a.length;i++) {
			boolean isvisited=false;
			int count=1;
			for(int k=i-1;k>=0;k--) {
				if(a[i]==a[k]) {
					isvisited=true;
					break;
				}
			}
			if(isvisited==false) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}
		
		
	}

}
