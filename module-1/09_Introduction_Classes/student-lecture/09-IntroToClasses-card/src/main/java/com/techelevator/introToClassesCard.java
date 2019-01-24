package com.techelevator;

public class introToClassesCard {
	
	public static void main(String[] args) {
        
        /*
         *  This program will demonstrate several concepts presented in the Java cohort 		
        */
		
		ginzCLI myGinzCLI = new ginzCLI(); // object to represent Command Line Interface (CLI) given
		
		PlayingCard aCard = new PlayingCard(); // instantiate a default playing card
		
		aCard.showCard();  //run ShowCard using our PlayingCard object
		
		PlayingCard card2 = new PlayingCard("Hearts", 5); {//instantiate a new playing card
			
		PlayingCard cardDefaultTest = new PlayingCard();
		//cardDefaultTest.showCard();
		
		
		card2.showCard();
		
		System.out.println("Color in card 2 is = " + card2.getColor());
		card2.setImage("HOOK");
		System.out.println("New Color in card 2 is = " + card2.getImage());
		
		card2.setValue(12);
		System.out.println("Get value name with case: " + card2.getValueName()); // this uses switch to find the value
		
		
		}
			
    }
}
		 

