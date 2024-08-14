import java.util.ArrayList;

public class Player {
    ArrayList<Card> personalDeck;

    public Player(){
        personalDeck = new ArrayList<>();
    }
    public String printDeck(){
        String deckStr = "";
        for (Card x : personalDeck){
            deckStr += x + ", ";
        }
        return deckStr;
    }
    public void acceptCards(ArrayList<Card> newCards){
        for (int i = 0; i < newCards.size(); i++) {
            personalDeck.add(newCards.get(i));
        }
    }

    public void acceptCards(Card card) {
        personalDeck.add(card);
    }

    public Card dealCards(){
        return personalDeck.remove(0);
    }

    public String toString(){
        return printDeck();
    }

    public ArrayList<Card> getPersonalDeck() {
        return new ArrayList<>(personalDeck);
    }

    public String getDealerHand() {
        if (personalDeck.size() > 1) {
            return personalDeck.get(0) + ", [Hidden Card]";
        }
        return "[Hidden Card]";
    }
}
