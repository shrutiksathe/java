package com.day16_Containment;
class Pen{
	int price;
	String color;
	String brand_name;
	
	Pen(int price,String color,String brand_name){
		this.price=price;
		this.brand_name=brand_name;
		this.color=color;
	}
	void show() {
		System.out.println("Pen:-"+price+" "+color+" "+brand_name);
	}
}

public class Bag {
	String brand_name;
	int price;
	Pen p;
	
	Bag(String brand_name,int price,Pen p){
		this.brand_name=brand_name;
		this.price=price;
		this.p=p;
	}
	void Display() {
		System.out.println("Bag:-"+brand_name+" "+price);
		p.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p=new Pen(10,"Blue","cello");
		Bag b=new Bag("NIKE",2000,p);
		b.Display();
		
		

	}

}
