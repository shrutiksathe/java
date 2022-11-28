package com.day_Inner_Class;

public class StaticOuter {
	static int i=30;
	static class Mystatic{
		void display() {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOuter.Mystatic obj=new StaticOuter.Mystatic();
		obj.display();

	}

}
