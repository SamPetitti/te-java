package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int number) {
		String[] numToSplitStr = Integer.toString(number).split("");
		if(number == 0) {
			return "";
		} else {
			if(number == 35 || number == 53) {
				return "FizzBuzz";
			}
		}
		if(number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		} else {
			if(number % 3 == 0) {
				return "Fizz";
			} else {
				if(number % 5 == 0) {
					return "Buzz";
				}
			}
		}
		int fizzBuzzCounter = 0;
			for(int i = 0; i< numToSplitStr.length; i++) {
					if(numToSplitStr[i].equals("3")) {
						fizzBuzzCounter += 1;
					} else {
						if(numToSplitStr[i].equals("5")) {
							fizzBuzzCounter += 2;
					}
				} 
				if(fizzBuzzCounter == 3){
					return "FizzBuzz";
				} else {
					if(fizzBuzzCounter == 2) {
						return "Buzz";
					} else {
						if(fizzBuzzCounter == 1) {
							return "Fizz";
						}
					}
				}
			} 
			if(number > 0 && number <= 100) {
						return Integer.toString(number);
				}
			
			 return "";
	}
			

}
