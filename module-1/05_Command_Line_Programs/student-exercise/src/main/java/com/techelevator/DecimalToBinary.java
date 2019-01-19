package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner keyBoard = new Scanner(System.in);
		int binaryInt;
		String binaryLine;
		System.out.println("Please enter in a series of decimal values");
		binaryLine = keyBoard.nextLine();
		binaryInt = Integer.parseInt(binaryLine);
		System.out.println(binaryInt + " in binary is " + Integer.toBinaryString(binaryInt)); 
	}

}

//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

//Integer.toBinaryString(124)
//460 in binary is 111001100