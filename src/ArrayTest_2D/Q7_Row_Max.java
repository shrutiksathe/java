package ArrayTest_2D;

public class Q7_Row_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{22,31,9},
				      {12,25,16}};
		int i=0,max=0,row=2;
		int result[]=new int[2];
		while(i<row) {
			  for(int j=0;j<arr[i].length;j++) {
				  if(arr[i][j]>max) {
					  max=arr[i][j];
				  }
			  }
			  result[i]=max;
			  max=0;
			  i++;
		}
		for(int k=0;k<result.length;k++) {
			System.out.println(result[k]);
		}

	}

}
