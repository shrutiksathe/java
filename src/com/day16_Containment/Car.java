package com.day16_Containment;
class Engi{
	String type;
	Engi(String type){
		this.type=type;
	}
	void show() {
		System.out.println(type);
	}
	
}

public class Car {
	int model_no;
	String name;
	int price;
	Engi e;
	
	Car(int model_no,String name,int price,Engi e){
		this.model_no=model_no;
		this.name=name;
		this.price=price;
		this.e=e;
	}
	void Display() {
		System.out.println(model_no+" "+name+" "+price);
		e.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engi e=new Engi("Manual");
		Car c=new Car(1,"BMW",400000,e);
		c.Display();

	}

}
