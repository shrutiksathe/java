package com.day.Constructor;

public class Account {
	public long accountNo;
	public String customerName;
  // default:-
//	Account(){
//		this.accountNo=45567;
//		this.customerName="Shrutik";
//		System.out.println(" I am default constructor");
//		System.out.println(accountNo+" "+customerName);
//	
//	}
//parametrized
	Account(long accountNo,String customerName){
		System.out.println("Im parametrized constructor");
		System.out.println(accountNo+" "+customerName);
		
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	   // Account obj=new Account();       // default
       Account obj1=new Account(12345678,"Alex"); //paramtz obj 1
       Account obj2=new Account(68001234,"Sam");   // paratz obj 2
       
	}

}
