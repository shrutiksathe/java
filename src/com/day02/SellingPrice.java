//Write a code to calculate the selling price if the cost price is 20rs and profit is 20% then calculate selling price.
package com.day02;

public class SellingPrice {

	public static void main(String[] args) {
		int cost_price= 20 , selling_price;
		int p = cost_price*20/100;
		selling_price= cost_price + p;
		
		System.out.println("The Selling price is = "+selling_price);

	}

}
