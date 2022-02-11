
package blackjack;

/**
 *
 * @author karimkamel
 */

//Declaration for the class
public class Card {
    
    //Declaring value of cards
    //52 cards in the deck
    //All cards have suit and value
    
    public enum Value{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, 
        EIGHT, NINE, TEN, JACK, QUEEN, KING;
        //Method that used for accessing the values of the numiration 
        public static Value getValues(int points) {
            //Array that holds the values for all numirations above
            Value[] values = Value.values();
            return values[points];
        }
      

        //Return the link to all these numirations for 13 values
        public static int getValueLenght(){
            return Value.values().length;
  
        }
        
    }
    //Second numiration
    public enum Suit{
        HEART, DIAMOND, CLUB, SPADE;
        
        //Method that used for accessing the suit of the numiration 
        public static Suit getSuites(int points) {
            //Array that holds the suits for all numirations above
            Suit[] suits = Suit.values();
            return suits[points];
        }
        //Return the link to all these numirations for 4 suits
        public static int getSuitLenght(){
            return Suit.values().length;
            
        }
    }
    //Creating attributes of the class
    private Suit suit;
    private Value value;
    
    //Creating constructor for the class
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;

    }
    // Generating Getters and Setters
    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
  
    //toString method used to show how the card would look like when calling it
    //For example: Club Seven, Hert King, Diamond Ace, Spade queen
    public String toString() {
        return this.suit + "_" + this.value;
    }
            

}
