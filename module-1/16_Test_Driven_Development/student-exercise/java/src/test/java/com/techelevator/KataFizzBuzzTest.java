package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	@Test
	public void Fizz_Buzz_Test_1() {
		Assert.assertEquals("That is not the expected result", "1", new KataFizzBuzz().fizzBuzz(1));
	}
	@Test
	public void Fizz_Buzz_Test_50() {
		Assert.assertEquals("That is not the expected result", "50", new KataFizzBuzz().fizzBuzz(50));
	}
	@Test
	public void Fizz_Buzz_Test_0() {
		Assert.assertEquals("That is not the expected result", "", new KataFizzBuzz().fizzBuzz(0));
	}
	@Test
	public void Fizz_Buzz_Test_101() {
		Assert.assertEquals("That is not the expected result", "", new KataFizzBuzz().fizzBuzz(101));
	}
	
	
}

//Write a program that returns numbers as Strings, but only if the number is between 1 and 100. 
//But for multiples of three return "Fizz" instead of the number and for the multiples of five return "Buzz".
//For numbers which are multiples of both three and five return "FizzBuzz?".
//Write tests that call a single methodString fizzBuzz(int number).
//Given a positive integer input n, return the FizzBuzz output as a string.