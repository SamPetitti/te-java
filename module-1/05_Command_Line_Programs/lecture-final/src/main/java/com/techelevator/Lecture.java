package com.techelevator;

import java.util.Scanner; //Include the Java code to support the Scanner class

public class Lecture {

	public static void main(String[] args) {
		
		Scanner keyBoard = new Scanner (System.in); //Define  a Scanner object to access the keyboard
		
		int aNumber = 0; //variable to hold keyboard input
		
		String aLine = "";
		
		System.out.println("Please enter a number");
		aLine = keyBoard.nextLine();
		aNumber = Integer.parseInt(aLine);
		
		aNumber++;
		
		System.out.println("The number you typed incremented is: " + aNumber);
	}

}
