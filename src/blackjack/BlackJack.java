package blackjack;
import java.util.Scanner;
/**
 *
 * @author karimemil
 * @modified Jack Arro Feb 12 2022
 */
public class BlackJack {
    public static void main(String[] args) {
        
        //Players input
        Scanner input = new Scanner(System.in);
        
        //Create dealer/ Welcome/ Ask to play
        Dealer dan = new Dealer();
        dan.startGame();
        
        //If true play & If else quit
        boolean play = input.nextBoolean();
        if(play == true){
            dan.play();
        }
        else{
            dan.noPlay();
        }
        
        //Game loop
        while(0 != 1){

            //***GAME CODE GOES HERE***
            
            //Request to play another round
            dan.newRound();
            
            //If true play & If else quit
            boolean newPlay = input.nextBoolean();
            if(newPlay == true){
                dan.play();
            }
            else{
                dan.endGame();
            }
        }
    }
}