package com.day12;

public class Car_GetterSetter {
	
	private int model_no;
	private String model_name;
	private float price;
	//private int speed;
	
	public void setModel_no(int mn) {
		this.model_no=mn;
	}
	public void setModel_name(String name) {
		this.model_name=name;
	}
	public void setPrice(float p) {
		this.price=p;
	}
	//getter
	public int getModel_no() {
		return model_no;
	}
	public String getModel_name() {
		return model_name;
	}
	public float getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_GetterSetter obj=new Car_GetterSetter();
		obj.setModel_no(101);
		obj.setModel_name("Splender");
		obj.setPrice(80000);
		
		System.out.println(obj.getModel_no());
		System.out.println(obj.getModel_name());
		System.out.println(obj.getPrice());

	}

}
