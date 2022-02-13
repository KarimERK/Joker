package blackjack;
/**
 * @author Jack Arro
 * 
 */
public class Dealer {
    String name = "Dan";
    
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
