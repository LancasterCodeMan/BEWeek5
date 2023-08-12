package bardwar;

import java.util.ArrayList;
import java.util.List;



public class Player {

	List<Card> hand = new ArrayList<Card>();
    private int score;
    private String name;

    public Player(String name) {
        hand = new ArrayList<>();
        score = 0;
        this.name = name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public String getName() {
        return name;
    }

    public Card flip() {
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }

    public void describe() {
        System.out.println("Player " + name + " has " + hand.size() + " cards in their hand.");
        for (Card card : hand) {
            card.describe();
        }
    }


}
