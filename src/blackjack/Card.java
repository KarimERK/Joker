
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
    }
}
