package com.day15_Static;

public class PrimeAvgSum {
	int count=0;
	int sum=0;
	public void prime() {
		for(int i=1;i<=20;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				count++;
				sum=sum+i;
				System.out.println(i+" ,");
			}
		}
		System.out.println("count="+count);
		int avg=sum/count;
		//System.out.println("avg="+(sum/count));
		System.out.println("avg="+avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeAvgSum obj=new PrimeAvgSum();
		obj.prime();

		
		
	}
}


