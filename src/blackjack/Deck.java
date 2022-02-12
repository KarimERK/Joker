package blackjack;
import java.util.ArrayList;
/**
 * @author karimemil
 * @modified Jack Arro Feb 2022
 */
public class Deck {
    
    //Array list for the card list that holds the cards
    ArrayList<Card> cards = new ArrayList<>();
  
    // Create method to take cards from numiration and fill the deck
    public void BuildDeck() {

    // Create a double for loop that holds both Suit and Value
    // First one to get the suit
    for (int i = 0; i < Card.Suit.getSuitLenght(); i++) {
        
    // Second one to get the value
    for (int k = 0; k < Card.Value.getValueLenght(); k++) {
        
    // Create a new card that wil get both value and suit 
    Card card = new Card (Card.Suit.getSuites(i), Card.Value.getValues(k));
    
    // Add the created card to an array list
    cards.add(card);
    }
    }
  }

    // Determining values for each card
    public int cardValue() {
        int value = 0;
        
      for (Card card : cards){
          switch(card.getValue()){
              case ACE : value += 1; break;
              case TWO : value+= 2; break;
              case THREE : value+= 3; break;
              case FOUR : value+= 4; break;
              case FIVE : value+= 5; break;
              case SIX : value+= 6; break;
              case SEVEN : value+= 7; break;
              case EIGHT : value+= 8; break;
              case NINE : value+= 9; break;
              case TEN : value+= 10; break;
              case KING : value+= 10; break;
              case QUEEN : value+= 10; break;
              case JACK : value+= 10; break;
          }
      }
  
        return value;
        
    }

    
}
