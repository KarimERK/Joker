
package blackjack;

import java.io.Serializable;

public class Player implements Serializable {

    private String name;
    private Hand hand;

    // Creating player object
    public Player() {
        hand = new Hand();

    }
    // Gets the player's cards to print as a string
    public String getHandString() {
        String str = "Cards:" + hand.toString();

        return str;
    }
    public void setName(String name1) {
        name = name1;
    }

    // Gets a player's name
    public String getName() {
        return name;
    }

    // Clearing player's hand
    public void clearHand() {
        hand.clearHand();
    }
    // Gets a player's hand total
    public int getTotal() {
        return hand.calculateTotal();
    }
    public void addCard(Card card) {
        hand.addCard(card);

    }
    public void blackjack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}