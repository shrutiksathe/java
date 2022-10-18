package com.day20_Array;

public class Second_Max_Number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,100};
		int z;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					z=arr[i];
					arr[i]=arr[j];
					arr[j]=z;
				}
			}
		}
		System.out.println(arr[1]);

	}

}
