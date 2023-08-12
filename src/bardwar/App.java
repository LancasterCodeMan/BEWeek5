package bardwar;

public class App {

	public static void main(String[] args) {
		  Deck deck = new Deck();
	        deck.shuffle();

	        Player player1 = new Player("Player 1");
	        Player player2 = new Player("Player 2");

	        for (int i = 0; i < 52; i++) {
	            player1.addCard(deck.draw());
	            player2.addCard(deck.draw());
	        }

	        int round = 1;
	        while (player1.hand.size() > 0 && player2.hand.size() > 0) {
	            System.out.println("Round " + round);
	            Card card1 = player1.flip();
	            Card card2 = player2.flip();

	            System.out.println("Player 1 played: " + card1);
	            System.out.println("Player 2 played: " + card2);

	            if (card1.getValue() > card2.getValue()) {
	                player1.incrementScore();
	            } else if (card2.getValue() > card1.getValue()) {
	                player2.incrementScore();
	            } else {
	                // War!
	                player1.addCard(deck.draw());
	                player1.addCard(deck.draw());
	                player2.addCard(deck.draw());
	                player2.addCard(deck.draw());

	                card1 = player1.flip();
	                card2 = player2.flip();

	                System.out.println("Player 1 played: " + card1);
	                System.out.println("Player 2 played: " + card2);

	                if (card1.getValue() > card2.getValue()) {
	                    player1.incrementScore();
	                } else if (card2.getValue() > card1.getValue()) {
	                    player2.incrementScore();
	                }
	            }

	            round++;
	        }

	        System.out.println("The winner is " + (player1.getScore() > player2.getScore() ? player1.getName() : player2.getName()));
	    }

}
