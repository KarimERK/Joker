package blackjack;
import java.util.ArrayList;
import java.util.Random;
/**
 * @author Jack Arro
 * 
 */
public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    Random random = new Random();
    
    public Card RandomCard(){
        int index = random.nextInt(cards.size());
        Card randomCard = cards.get(index);
        return randomCard;
    }
}
