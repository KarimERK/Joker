package blackjack;
public class Hand {

    private Card[] hand = new Card[12];
    private int numberOfCards = 0;

    // Calculates the total of a hand 
    public int calculateTotal() {
        int total = 0;
        boolean aceCard = false;
        for (int i = 0; i < numberOfCards; i++) {
            int value = hand[i].getValue();
        }
        return total;
    }

    public String toString() {
        return this.toString(false, false);
    }

    public String toString(boolean isDealer, boolean hideHoleCard) {
        String str = "";
        int total = 0;
        boolean aceCard = false;
        String aceString = "";
        for (int i = 0; i < numberOfCards; i++) {
            if (isDealer && hideHoleCard && i == 0) {
                str = " Showing";
            } else {
                int value = hand[i].getValue();
                String valueName;
                if (value > 10) {
                    valueName = hand[i].getValueName().substring(0, 1);
                } else if (value == 1) {
                    valueName = "A";
                } else {
                    valueName = Integer.toString(value);
                }
                str += " " + valueName + hand[i].getSuitDesign();
                // In case of ACE counted as 1 or 11
                if (value > 10) {
                    value = 10;
                } else if (value == 1) {
                    aceCard = true;
                }
                total += value;
            }
        }
        if (aceCard && total + 10 <= 21) {
            aceString = " or " + (total + 10);
        }
        if (hideHoleCard) {
            return str;
        } else {
            return str + " totals " + total + aceString;
        }

    }
    // In case of hit to add card
    public void addCard(Card card) {
        hand[numberOfCards++] = card;
    }

    // To clear hand and set number of cards to 0
    public void clearHand() {
        numberOfCards = 0;
    }

    public boolean dealerPeek() {
        int value = hand[1].getValue();
        return value == 1 || value >= 10;
    }
}