package com.day_Inner_Class;

public class LocalInner {             // outer class
	
	public void read() {
		class MethodInnerClass{      // inner class
			public void show() {
				System.out.println("Hii Local");
			}
		}
		MethodInnerClass m=new MethodInnerClass(); // inner object create
		m.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner l=new LocalInner();     // outer obj create
		l.read();

	}

}
