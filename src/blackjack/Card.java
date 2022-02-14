package blackjack;
/**
 *
 * @author karimkamel
 * @modified Jack Arro Feb 12 2022
 */


public class Card 
{

	
    
    
    //Defining Suit and Value as strings for gamne playing 
	private String suit;
	private String value;

        
        /*Making data "private" is information hiding, so that it cannot be access by
	 *someone else with code outside this class.*/
	//private Card() {
	//}

	public Card(String newCardSuit, String newCardValue) {
	// Cheking that the card is valid for playing
        
                //Checking the Card nuber to be between ACE and KING for valid card numbers
            if      (newCardValue == "Ace" || newCardValue == "Two" ||newCardValue == "Three" ||newCardValue == "Four" 
                    ||newCardValue == "Five" ||newCardValue == "Six" ||newCardValue == "Seven" ||newCardValue == "Eight" 
                    ||newCardValue == "Nine" ||newCardValue == "Ten" ||newCardValue == "Jack" ||newCardValue == "Queen" 
                    ||newCardValue == "King") {
                //Setting the card number
                this.value = newCardValue;
                } 

               
                // Checking the card suit to be valid between Hearts,spades,Diamonds, or CLubs
                // By using the first letter only
            if      (newCardSuit == "HEARTS" || newCardSuit == "DIAMONDS" ||
                    newCardSuit == "CLUBS" || newCardSuit == "SPADES") {
                    this.suit = newCardSuit;
                }

		}

	/*This is encapsulation, it's providing access to the hidden information by
	 *putting it together in one unit with a public method. So, anyone who wants
	 *our data will have to use a setter/getter.*/
        
       // Creating get value the card value
	public String getValue() {
            return this.value;
	}
        
	public String getSuit() {
            return suit;
	}
	
	public boolean compareSuit(Card card){
            return this.suit == card.getSuit();
	}
	
	public boolean compareValue(Card card){
            return this.value == card.getValue();
	}
	
	public boolean compareTo(Card card){
            return this.suit == card.getSuit() && this.value == card.getValue();
	}
} 



//End class

//Declaration for the class
/*public abstract class Card {
    
    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return this.value;
    }

    public Suit getSuit() {
        return this.suit;
    }
    
    @Override
    public abstract String toString();
}

/*
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
    @Override
    public String toString() {
        return this.suit + "_" + this.value;
    }
*/