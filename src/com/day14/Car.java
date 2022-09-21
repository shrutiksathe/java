package com.day14;

public class Car {
	int model;
	String name;
	int price;
	
public Car(int model,String name,int price) {
	this.model=model;
	this.name=name;
	this.price=price;
}

void Display() {
	System.out.println(model+" "+name+" "+price);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car(1,"BMW",500000);
		Car a=new Car(2,"ODDI",800000);
		obj.Display();

	}

}
