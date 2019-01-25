package com.techelevator.shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	
	private int totalNumberOfItems = 0;
	private double totalAmountOwed = 0.0;
	
	
	// productName value = number of items
	
	// private Map <String, Integer> items = new HashMap<>();
	 
	 
	
	
	public double getAveragePricePerItem() {
		if(totalNumberOfItems == 0 && totalAmountOwed == 0.0) {
			return 0.0;
		}
		return totalAmountOwed/totalNumberOfItems;
		
	}
	
	
	public void printCart() {
		System.out.println("Total Number Of Items = " + totalNumberOfItems);
		System.out.println("Total Amount Owed = $" + totalAmountOwed);
	}
						//String product name
	public void addItems(int numberOfItems, double pricePerItem) {
		totalNumberOfItems = numberOfItems + totalNumberOfItems;
		totalAmountOwed = totalAmountOwed + (numberOfItems * pricePerItem);
		//item.put(productname,);
		// if items contains key(productname) items.put(productname, 
		//items.get(prodcutname)+ number of items
		// else{ items.put(product name, numberofitems);
	}
	
	public void empty() {
		totalNumberOfItems = 0;
		totalAmountOwed = 0.0;
		// items = new HashMap;
	}

	/**
	 * @return the totalNumberOfItems
	 */
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	/**
	 * @param totalNumberOfItems the totalNumberOfItems to set
	 */
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}

	/**
	 * @return the totalAmountOwed
	 */
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}

	/**
	 * @param totalAmountOwed the totalAmountOwed to set
	 */
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
	
	

}
