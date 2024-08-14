package War;
import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    private int index;

    public Deck() {
        index = 0;
        for (int j = 1; j < 5; j++) {
            for (int k = 2; k <= 14; k++) {
                Card newCard = new Card(j, k);
                cards.add(newCard);
                index++;
            }
        }
    }

    public void printDeck() {
        for (Card x : cards) {
            System.out.print(x + ", ");
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public String toString() {
        this.printDeck();
        return "";
    }

    public int getSize(){
        return cards.size();
    }

    public Card dealCard() {
        return cards.remove(0);
    }
}
