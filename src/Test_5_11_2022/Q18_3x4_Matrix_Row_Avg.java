package Test_5_11_2022;
//Print average of each row and column for 3x4 matrix 2D array. Data is already present 
public class Q18_3x4_Matrix_Row_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{4,5,2,5},{7,8,6,5},{1,2,4,5}};

		for(int i=0;i<arr.length;i++) {
			int sum=0;
			
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println("="+sum+ " avg is= "+sum/4);
			System.out.println();
		}
		
	}

}
