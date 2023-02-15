package com.group5.hackathon;
import java.util.Random;

public class Test {

public static void main(String[] args) {
		
		Deck myDeck = new Deck();
		for (Card card: myDeck.getCards()) {
			card.showCard();
		}
		
		
		System.out.println("----- PLayer Testing ------");

		
		System.out.println(myDeck.getRandomNum());
		
		
		
	}

	
	
	

}
