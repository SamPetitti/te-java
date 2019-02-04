package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		String[] numToSplitStr = Integer.toString(number).split("");
		if(number == 0) {
			return "";
		} else {
		if(number % 3 == 0) {
			return "Fizz";
		} else {
		  for(int i =0; i< numToSplitStr.length; i++) {
			  if(numToSplitStr[i].equals("3")) {
				  return "Fizz";
			  }
		  }
		if(number > 0 && number<= 100) {
			return Integer.toString(number);
				} 
			}
		} return "";
	
	}
	


}
