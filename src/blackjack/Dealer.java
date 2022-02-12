package blackjack;
/**
 * @author Jack Arro
 * 
 */
public class Dealer {
    String name = Dan;
    Deck deck = new Deck();
    
    public void startGame(){
        System.out.println("Hello! My name is " + name + ", and I will be your dealer in black jack today!");
    }
    
    public void playerLose(){
        System.out.println("Sorry...Looks like I won this time.");
    }
    
    public void playerWin(){
        System.out.println("Congratulations! You won!");
    }
    
    public void newRound(){
        System.out.println("Would you like to play another round?");
    }
    
    public void endGame(){
        System.out.println("Thank you for playing!");
        System.exit(0);
    }
    
    
}
