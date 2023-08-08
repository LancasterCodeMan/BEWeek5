package cardgame;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>(); 
	
	
	Deck(){
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
							"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				cards.add(new Card(number, suit, count));
				count++;
			}
		}
		
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
		
	}
}
