package DeckClass;
public class Deck {
    private Card[] deck;
    public Deck(){
        deck = new Card[52];
        int index = 0;
        for (int j = 1; j < 5; j++) {
            for (int k = 2; k <= 14; k++) {
                Card newCard = new Card(j, k);
                deck[index] = newCard;
                index++;
            }
        }
    }
    public void printDeck(){
        for(Card x : deck){
            System.out.println(x + ", ");
        }
    }
    public String toString() {
        this.printDeck();
        return "";
    }
}
