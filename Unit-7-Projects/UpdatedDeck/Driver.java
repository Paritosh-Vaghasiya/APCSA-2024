package UpdatedDeck;

public class Driver {
    public static void main(String[] args){
        Card card = new Card(1, 9);
        System.out.println(card);

        Card card1 = new Card(3, 14);
        System.out.println(card1);

        int value = card.compareTo(card1);
        System.out.println(value);

        value = card1.compareTo(card);
        System.out.println(value);

        Deck cards = new Deck();
        System.out.println(cards);

        cards.shuffleDeck();
        System.out.println(cards);
    }
}
