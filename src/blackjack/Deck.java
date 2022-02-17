package blackjack;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Deck extends Exception implements Serializable {
    //Creating ineger Card for deck
    private int nextCardIndex;

    Card[] deck = new Card[52];

    public Deck() {

        int count = 0;

        // Creating 13 cards for each suit
        for (int i = 1; i <= 13; i++) {
            deck[count++] = new Card('H', i) {};
            deck[count++] = new Card('S', i) {};
            deck[count++] = new Card('C', i) {};
            deck[count++] = new Card('D', i) {};
        }
    }

    // Generating getters for the random card
    public Card getCard(int index) {
        return deck[index];
    }
    // Giving the next card in case of Hit and if the deck still has cards
    public Card nextCard() {

        if (nextCardIndex < 0 || nextCardIndex > 51) {
            System.out.println("Future exception goes here");
        }
        return deck[nextCardIndex++];
    }

    private void swapCards(int index1, int index2) {
        Card hold;
        hold = deck[index1];
        deck[index1] = deck[index2];
        deck[index2] = hold;
    }

    // Generating random numbers and shuffling the deck for playing
    public void shuffle() {
        Random rn = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < deck.length; j++) {
                swapCards(i, rn.nextInt(52));
            }
        }
        nextCardIndex = 0;
    }

}