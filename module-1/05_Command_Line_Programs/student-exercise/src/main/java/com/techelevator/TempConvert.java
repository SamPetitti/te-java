package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		
		double tempNum = 0.0;
		double tempC = 0.0;
		double tempF = 0.0;
		
		String tempNumLine;
		//String tempCTempFLine;
		
		System.out.println("Please enter your temperature:");
		tempNumLine = keyBoard.nextLine();
		tempNum = Double.parseDouble(tempNumLine);
		
		System.out.println("Please enter F for Fahrenheit or C for Celsius:");
		tempNumLine = keyBoard.nextLine();
		
		
		if(tempNumLine.equals("F")){ 
			tempC = ((tempNum - 32) / 1.8);
			System.out.println("Your temperature converted to Celcius = " + tempC + "C");
			} else {
				if(tempNumLine.equals("C")) {
					tempF = ((tempNum * 1.8) + 32);
					}
			System.out.println("Your temperature converted to Fahrenheit = " + tempF + "F");
		}
	}

}


