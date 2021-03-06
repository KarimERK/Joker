
package blackjack;



/**
 * @author Karim Kamel Feb 2022
 * @modifier Jack Arro Feb 12 2022
 */
import java.util.Scanner;


public class Game {
    // creating objects from the users / players / deck and dealer in order to start the game
    private Scanner jk = new Scanner(System.in);
    private int users;
    private Player[] players;
    private Deck deck;
    private Dealer dealer = new Dealer();

    // Starts game and displays the rules based on the given instructions 
    public void initializeGame() {
        String names;
        //printing the rules 

        System.out.println("Welcome To Our Blackjack Game!");

        System.out.println("");



        //Fixing the players / users to be 2 only for simplicity
        users = 2;

        //creating the players from the users created above as 2 players only 
        players = new Player[users];

        //Creating a new Deck object to be used for this game deck is 52 card please refer to the Deck class
        deck = new Deck();

        // AGetting player names to start the game
        for (int i = 0; i < users; i++) {
            System.out.print("What is player " + (i + 1) + "'s name? ");
            names = jk.next();
            //creating players array in the loop
            players[i] = new Player();
            //setting the players names using the player setName function
            players[i].setName(names);
        }
    }

    // Shuffles the deck
    public void shuffle() {
        deck.shuffle();
    }




    // Deals the cards to the players and dealer
    public void dealCards() {
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < users; i++) {
                //getting the next card  if user calls this funtion 
                players[i].addCard(deck.nextCard());
            }
        }
        //getting next card for the dealer
        dealer.addCard(deck.nextCard());
    }


    // Initial check for dealer or player Blackjack if the total score of the cards is 21
    public void checkBlackjack() {


        if (dealer.isBlackjack()) {
            System.out.println("Dealer has BlackJack!");
            for (int i = 0; i < users; i++) {
                if (players[i].getTotal() == 21) {
                    System.out.println(players[i].getName() + " pushes");
                } else {
                    //if the sum of the cards is creater than 21 then print the player name and " loses "
                    System.out.println(players[i].getName() + " loses (Try again wish you best of luck");
                }
            }
        } else {
            if (dealer.peek()) {
                //checking ofthe dealer is having 21 after successful player 21
                System.out.println("Dealer peeks and does not have a BlackJack");
            }
            for (int i = 0; i < users; i++) {
                if (players[i].getTotal() == 21) {
                    System.out.println(players[i].getName() + " has blackjack!");
                    players[i].blackjack();
                }
            }
        }
    }

    // This code takes the user commands to hit or stand
    public void hitOrStand() {
        String command;
        char c;
        for (int i = 0; i < users; i++) {
            System.out.println();
            System.out.println(players[i].getName() + " has " + players[i].getHandString());
            do {
                System.out.print(players[i].getName() + " (H)it or (S)tand? ");
                command = jk.next();
                c = command.toUpperCase().charAt(0);
            } while (!(c == 'H' || c == 'S'));
            if (c == 'H') {
                players[i].addCard(deck.nextCard());
                System.out.println(players[i].getName() + " has " + players[i].getHandString());
            } else if (c == 'S') {
                System.out.println(players[i].getName() + " has " + players[i].getHandString());
            }
        }
    }




    // Code for the dealer to play
    public void dealerPlays() {
        boolean isSomePlayerStillInTheGame = false;
        for (int i = 0; i < users && isSomePlayerStillInTheGame == false; i++) {
            isSomePlayerStillInTheGame = true;
        }
        if (isSomePlayerStillInTheGame) {
            dealer.dealerPlay(deck);
        }
    }

    // This code calculates all possible outcomes 
    public void settleBets() {
        System.out.println();
        for (int i = 0; i < users; i++) {
            if (players[i].getTotal() > 0) {
                if (players[i].getTotal() > 21) {
                    System.out.println(players[i].getName() + " has busted");

                } else if (players[i].getTotal() == dealer.calculateTotal()) {
                    System.out.println(players[i].getName() + " has pushed");

                } else if (players[i].getTotal() < dealer.calculateTotal() && dealer.calculateTotal() <= 21) {
                    System.out.println(players[i].getName() + " has lost");

                } else if (players[i].getTotal() == 21) {
                    System.out.println(players[i].getName() + " has won with blackjack!");
                    players[i].blackjack();
                } else {
                    System.out.println(players[i].getName() + " has won");


                }
            }
        }

    }

    // This code resets all hands
    public void clearHands() {
        for (int i = 0; i < users; i++) {
            players[i].clearHand();
        }
        dealer.clearHand();

    }

    // This decides to force the game to end when all players lose or lets players choose to keep playing or not
    public boolean playAgain() {
        String command;
        char c;
        Boolean playState = true;
        if (forceEnd()) {
            playState = false;
        } else {
            do {
                System.out.println("");
                System.out.print("Do you want to play again (Y)es or (N)o? ");
                command = jk.next();
                c = command.toUpperCase().charAt(0);
            } while (!(c == 'Y' || c == 'N'));
            if (c == 'N') {
                playState = false;
            }
        }
        return playState;
    }
    public void printStatus() {
        for (int i = 0; i < users; i++) {
            System.out.println(players[i].getName() + " has " + players[i].getHandString());
        }
    }

    {
        System.out.println("Dealer has " + dealer.getHandString(true, true));
    }
    // This says true or false to forcing the game to end
    public boolean forceEnd() {
        boolean end = false;
        int endCount = 0;

        for (int i = 0; i < users; i++) {


            if (endCount == users) {
                end = true;
            }
            if (end) {
                System.out.println("");
                System.out.println("All players have lost and the game ends.");
            }

            return end;
        }
        return false;
    }


    // This is the endgame code for when all players are out of the game or players decide to stop playing
    public void endGame() {
        int endAmount = 0;
        String endState = " Total ";
        System.out.println("");
        for (int i = 0; i < users; i++) {

            if (endAmount > 0) {
                endState = " gain of ";
            } else if (endAmount < 0) {
                endState = " loss of ";
            }
            System.out.println(players[i].getName() + " has ended the game with " + ".");

            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Thank you for playing!");
    }


}