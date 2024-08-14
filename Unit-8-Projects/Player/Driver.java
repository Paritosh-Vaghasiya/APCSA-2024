package Player;

public class Driver {
    public static void main(String[] args){
        Deck cards = new Deck();
        cards.shuffleDeck();
        System.out.println(cards);

        Player one = new Player();
        for (int i = 0; i < 26; i++) {
            one.addOneCard(cards.dealCard());
        }
        System.out.println("one");
        System.out.println(one);

        Player two = new Player();
        for (int i = 0; i < 26; i++) {
            two.addOneCard(cards.dealCard());
        }
        System.out.println("two");
        System.out.println(two);
    }
}
