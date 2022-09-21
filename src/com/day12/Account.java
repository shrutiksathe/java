package com.day12;

public class Account {
	int accid;
	String acctype;
	double balance;
	double deposite;
	double withdraw;
	//double acbala
	//setter
	public void setAccid(int id) {
		this.accid=id;
	}
	public void setAcctype(String type) {
		this.acctype=type;
	}
	public void setBalance(float bal) {
		this.balance=bal;
	}
	//getter
	public int getAccid() {
		return accid;
	}
	public String getAcctype() {
		return acctype;
	}
	public double getBalance() {
		return balance;
	}
	
//	public void Display() {
//		System.out.println("Acc No :-"+accid);
//		System.out.println("Acc Name :-"+acctype);
//		System.out.println("Balance:-"+balance);
//	}
	public void deposite(double deposite) {
		this.deposite=deposite;
		System.out.println("enter deposite ammount :- "+deposite);
		balance=balance+deposite;
		System.out.println("Updated balance is:"+balance);
		
	}
	public void withdraw(double withdraw) {
		this.withdraw=withdraw;
		System.out.println("Enter your withdraw ammount :- "+withdraw);
		balance=balance-withdraw;
		System.out.println("updated balance is :"+balance);
	}
	
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account obj=new Account();
        //obj.Display();
        
        obj.setAccid(1122334455);
        obj.setAcctype("Saving");
        obj.setBalance(50000);
        
        obj.deposite(10000);
        obj.withdraw(20000);
        
        
        
	}

}
