package com.day16_Containment;
class Address{
	int pincode;
	String city;
	Address(int pincode,String city){
		this.pincode=pincode;
		this.city=city;
	}
	void show() {
		System.out.println(pincode+" "+city);
	}
}

public class Person {
	int id;
	String name;
	Address adr;
	
	Person(int id,String name,Address adr){
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	void display_Person() {
		System.out.println(id+" "+name+ " ");
		adr.show();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address adr=new Address(410501,"pune");
	
		Person p=new Person(1,"Shrutik",adr);
	     p.display_Person();

	}

}
