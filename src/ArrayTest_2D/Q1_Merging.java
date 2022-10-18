package ArrayTest_2D;
//1.	Merging elements of two different arrays alternatively in third array [2]
//        Input : arr1[] = {1, 2, 3, 4, 5, 6, 7, 8}
//           arr2[] = {11, 22, 33, 44}
//        Output: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6, 7, 8}


public class Q1_Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr1[]= {1,2,3,4,5,6,7,8};
		 int arr2[]= {11,22,33,44};
           
//		 int j=0,k=0;
//		 int c[]=new int[10];
//		for(int i=0;i<c.length;i++) {
//		      if(i%2==0) {
//		    	  c[i]=arr1[i];
//		    	  j++;
//		      }
//		      else {
//		    	  c[i]=arr2[i];
//		    	  k++;
//		      }
//			}
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//		}
		 int n1=arr1.length;
		 int n2=arr2.length;
		 int arr3[]=new int[n1+n2];
		 int i=0,j=0,k=0;
		 while(i<n1 && j<n2) {
			 arr3[k++]=arr1[i++];
			 arr3[k++]=arr2[j++];
		 }
		 while(i<n1) {
			 arr3[k++]=arr1[i++];
		 }
		 while(j<n2) {
			 arr3[k++]=arr2[j++];
		 }
		 //Display 
		 for(int m=0;m<n1+n2;m++) {
			 System.out.print(arr3[m]+" ");
		 }
		}
	}


