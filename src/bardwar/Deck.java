package bardwar;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit.name()));
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.size(); i++) {
            int j = (int) (Math.random() * cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    public Card draw() {
        return cards.remove(0);
    }

    public int getNumCards() {
        return cards.size();
    }

}
