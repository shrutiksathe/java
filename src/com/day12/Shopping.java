package com.day12;

public class Shopping {
	String purchase_item;
	int quantity;
	int price;
	int sum;
	
	public void accept(String name,int q,int p) {
		purchase_item=name;
		quantity=q;
		price=p;
	}
	public void bill() {
		if(quantity>0) {
			sum=quantity*price;
		}
		else {
			System.out.println("Error..");
		}
	}
	public void Display() {
		System.out.println("item name:-"+purchase_item+"\nQuantity:-"+quantity+"\nprice:-"+price);
		System.out.println("Bill:-"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping obj=new Shopping();
		obj.accept("Pen", 2, 10);
		obj.accept("Pen", 2, 10);
		obj.bill();
		obj.Display();

	}

}
