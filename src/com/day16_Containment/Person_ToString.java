package com.day16_Containment;
 class Addres{
	 int pincode;
	 String city;
	 
	 Addres(int pincode,String city){
		 this.pincode=pincode;
		 this.city=city;
	 }
	 public String toString() {          //use this insted of show or Display
		 return pincode+" "+city;
	 }
 }


public class Person_ToString {
	int id;
	String name;
	Addres ad;
	
	Person_ToString(int id,String name,Addres ad){
		this.id=id;
		this.name=name;
		this.ad=ad;
		
	}
	public String toString() {
		return id+" "+name+" "+ad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addres ad=new Addres(41000,"Pune");
		Person_ToString p=new Person_ToString(1,"Shrutik",ad);
         System.out.println(p);
	}

}
