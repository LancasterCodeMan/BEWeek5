package cardgame;

public class CardGame {

	public static void main(String[] args) {	
		
		System.out.println("\nQuestion 1: Card Class");
		
		Card tempCard = new Card("Queen", "Hearts", 12);
		tempCard.describe();
		
		System.out.println("\nQuestion 2: Deck Class");
		
		Deck deck = new Deck();
		deck.describe();
	
		
	}

}
