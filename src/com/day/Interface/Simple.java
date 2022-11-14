package com.day.Interface;
interface Drawable{
	String nm="Dog";
	public void draw();
//	default void m1() {
//		System.out.println("m1");
//	}
}
class Animal implements Drawable{
     public void draw() {
	
		System.out.println("Drawing picture of :- "+nm);
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal nm=new Animal();
        nm.draw();
//        nm.m1();
	}

}
