package com.group5.hackathon;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            for (Integer rank = 1; rank <= 13; rank++) {
                this.cards.add(new Card(name, rank));
            }
        }
    }
    
    
    
    public void getRandomNum() {
//		System.out.println(super.getsuit() + super.getrank(random));
		Random rand = new Random();
		int randSuit = rand.nextInt(4);
		int randRank = rand.nextInt(13);
		Integer[] randCard = {randSuit, randRank};
		System.out.println(randCard[0]+ " " + randCard[1]);
		randomCard(randCard);
//		Deck deck = new Deck
	}
    
    public ArrayList<Card> randomCard(Integer[] randCard) {
    	return this.cards;
    }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
}
