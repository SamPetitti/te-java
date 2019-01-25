package com.techelevator.shoppingcart;

public class SamShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingCart samCart = new ShoppingCart();
		
		samCart.addItems(5, 0.99);
		
		samCart.addItems(10, 2.99);
		
		samCart.printCart();
		
		ShoppingCart jasonCart = new ShoppingCart();
		
		jasonCart.addItems(44, 99.99);
		
		jasonCart.empty();
		
		jasonCart.printCart();
		
		ShoppingCart bridgetCart = new ShoppingCart();
		
		bridgetCart.addItems(4, 7.00);
		
		bridgetCart.addItems(5, 9.00);
		
		bridgetCart.getTotalNumberOfItems();
		
		bridgetCart.printCart();

	}

}
