package blackjack;
/**
 * @author Jack Arro
 * 
 */


public class Dealer {
    String name = "Dan";
    
    
    private Hand hand = new Hand();

    // Determines if dealer has a blackjack
    public boolean isBlackjack(){
        if (hand.calculateTotal() == 21){
                return true;
        } else {
                return false;
        }
    }
	
	// This automates the dealer's play
    public void dealerPlay(Deck deck){
        System.out.println();
        while (hand.calculateTotal() <= 16) {
                System.out.println("Dealer has " + hand.calculateTotal()+ " and hits");
                hand.addCard(deck.nextCard());
                System.out.println("Dealer " + this.getHandString(true, false));
        } 
        if ( hand.calculateTotal() > 21) {
                System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
                System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }
	
	// Adds a card o the dealer's hand
    public void addCard(Card card) {
		hand.addCard(card);
	}
	
	// Gets the dealer's hand as a string
    public String getHandString(boolean isDealer, boolean hideHoleCard ) {
            String str = "Cards:" + hand.toString(isDealer, hideHoleCard);
            return str;
    }
	
	// Calculates the dealer's hand total
    public int calculateTotal() {
        return hand.calculateTotal();
    }
	
	// Clears the dealer's hand
    public void clearHand() {
        hand.clearHand();
    }
	
	// Peeks the dealer's face-down card
    public boolean peek() {
            return hand.dealerPeek();
    }
        
        ///functons to be used in the main run
    public void startGame(){
        System.out.println("Hello! My name is " + name + ", and I will be your dealer in blackjack today!");
        System.out.print("Would you like to play a game of blackjack?(Say true if yes, and false if no!): ");
    }
    
    public void play(){
        System.out.println("Great! Let's play!");
    }
    
    public void noPlay(){
        System.out.println("No problem! Come back anytime!");
        System.exit(0);
    }
    
    public void playerMove(){
        System.out.println("Would you like to hit or stand?(Say true if hit, and false if stand!): ");
    }
    
    public void playerLose(){
        System.out.println("Sorry...Looks like I won this time.");
    }
    
    public void playerWin(){
        System.out.println("Congratulations! You won!");
    }
    
    public void newRound(){
        System.out.print("Would you like to play another round?(Say true if yes, and false if no!): ");
    }
    
    public void endGame(){
        System.out.println("Thank you for playing! Goodbye!");
        System.exit(0);
    }
    
}
