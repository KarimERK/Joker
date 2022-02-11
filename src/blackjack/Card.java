
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

}
