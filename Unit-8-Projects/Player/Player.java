package Player;

import java.util.ArrayList;

public class Player {
    ArrayList<Card> personalDeck;

    public Player(){
        personalDeck = new ArrayList<>();
    }
    public String printDeck(){
        for (Card x: personalDeck){
            System.out.print(x + ", ");
        }
        return null;
    }
    public void acceptCards(ArrayList<Card> newCards){
        for (int i = 0; i < newCards.size(); i++) {
            personalDeck.add(newCards.get(i));
        }
    }

    public void addOneCard(Card card) {
        personalDeck.add(card);
    }

    public Card dealCards(){
        Card top = personalDeck.get(0);
        personalDeck.remove(0);
        return top;
    }
    public String toString(){
        printDeck();
        return "";
    }
}
