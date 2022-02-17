package blackjack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class BlackJack {
    //defining the main class for the run
    public static void main(String[] args) throws Exception {
        //creating new game object nammed as mygame to start the black jack game
        Game mygame = new Game();
        // initializing the game to set the defailts needed for execution setting players to 2 + the dealer
        mygame.initializeGame();
        // creating an do while loop to keep playing if the user press Y then the application to trigger the playAgain function 
        do {
            //after creating the cards and the deck start shuffling the cards to get random card
            mygame.shuffle();

            // checking of the sum of the cards are 21 raise a boolien flag to win directly
            //mygame.checkBlackjack();
            mygame.printStatus();
            mygame.hitOrStand();
            mygame.dealerPlays();
            // to be removed mygame.settleBets();
            //to be removed mygame.printMoney();
            //Clearing all the hands to be ready for the next round
            mygame.clearHands();
        }
        while (mygame.playAgain());
        //mygame.endGame();
        // handeling all bad inputs if any from the end user using try catch, this can be enhanced later if needed
        // Putting the below objects in try catch to catch any unexpected errors    
        try {
            FileOutputStream outObjectFile = new FileOutputStream("objOut", false);

            ObjectOutputStream outObjectStream = new ObjectOutputStream(outObjectFile);

            outObjectStream.writeObject(mygame);

            outObjectStream.flush();
            outObjectStream.close();
        } catch (FileNotFoundException fnfException) {
            System.out.println("No file");
        } catch (IOException ioException) {
            System.out.println("Ok");
        }

        try {
            FileInputStream inObjectFile = new FileInputStream("objOut");

            ObjectInputStream inObjectStream = new ObjectInputStream(inObjectFile);
            // Creating new card object
            Card myNewCard = (Card) inObjectStream.readObject();
            // Printing card object
            System.out.println(myNewCard);

        } catch (FileNotFoundException fnfException) {
            System.out.println("No File");
        } catch (IOException ioException) {
            System.out.println("Good Bye");
        } catch (ClassNotFoundException cnfException) {
            System.out.println("This is not a Card.");
        }

    }

}