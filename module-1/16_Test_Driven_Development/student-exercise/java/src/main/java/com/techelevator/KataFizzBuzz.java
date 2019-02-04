package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		if(number == 0) {
			return "";
		} else {
		if(number % 3 == 0) {
			return "Fizz";
		} else {
		if(number > 0 && number<= 100) {
			return Integer.toString(number);
				} 
			}
		} return "";
	
	}
	


}
