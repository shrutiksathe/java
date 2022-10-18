package com.day23_String;

public class SimpleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Hello"; // literal string create
		String nme=new String("friend"); // by using new 
		//length
		System.out.println("Length of String:- "+nme.length());
		
		
		// concat method
          String s1="Hello";
          String s2=new String("World");
          System.out.println(s1.concat(s2)); // o/p:- HelloWorld
          
          
          String e1="Good";
          e1=e1.concat("Morning");
          System.out.println(e1);   // o/p:- GoodMorning
          
       //campareTo() method
          String y="Hello";
          String z="hello";
          System.out.println("Compare to method: "+y.compareTo(z));

          //toLowercase() method
          String nm="SHRUTIK";
          System.out.println("Lower case is:-"+nm.toLowerCase()); // print uppercase letter in lower case
          
          //toUppercase() method
          String n="shrutik";
          System.out.println("Upper case is:-"+n.toUpperCase());
           
          
          // indexof() --based on character value check index number
          
          String f1="afternoon";
          System.out.println(f1.indexOf('f'));   // check index position of letter index start from '0'.
          
          
          
	}

}
