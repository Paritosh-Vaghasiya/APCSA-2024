package War;
import java.util.ArrayList;

public class War {
    private Player player1;
    private Player player2;
    private Deck deck;
    private int rounds;

    public War(){
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        for (int i = 0; i < 20; i++) {
            deck.shuffleDeck();
        }
        System.out.println(deck);
        dealCards();
        System.out.println("Player 1: " + player1);
        System.out.println("Player 2: " + player2);
        System.out.println();
        playGame();
    }
    public void dealCards(){
        for (int i = 0; i < 26; i++) {
            player1.acceptCards(deck.dealCard());
            player2.acceptCards(deck.dealCard());
        }
    }
    public void playGame(){
        rounds = 0;
        while (!isGameOver()) {
            rounds++;
            System.out.println("Round: " + rounds);
            playRound(new ArrayList<Card>(), new ArrayList<Card>());
            System.out.println();
        }
        if (player1.personalDeck.size() > 0) {
            System.out.println("Player 1 wins the game after " + rounds + " rounds!");
        } else {
            System.out.println("Player 2 wins the game after " + rounds + " rounds!");
        }
    }

    public void playRound(ArrayList<Card> temp1, ArrayList<Card> temp2){
        if (isGameOver()){
            System.out.println("Game Over");
        }

        Card temp_card1 = player1.dealCards();
        Card temp_card2 = player2.dealCards();
        temp1.add(temp_card1);
        temp2.add(temp_card2);

        System.out.println("Player 1 plays: " + temp1);
        System.out.println("Player 1 plays: " + temp_card1);
        System.out.println("Player 1 Decks Size: " + player1.personalDeck.size());
        System.out.println("Player 2 plays: " + temp2);
        System.out.println("Player 2 plays: " + temp_card2);
        System.out.println("Player 2 Decks Size: " + player2.personalDeck.size());

        int compareResult = temp_card1.compareTo(temp_card2);
        if (compareResult > 0) {
            System.out.println("Player 1 wins the round!");
            player1.acceptCards(temp1);
            player1.acceptCards(temp2);
        } else if (compareResult < 0) {
            System.out.println("Player 2 wins the round!");
            player2.acceptCards(temp1);
            player2.acceptCards(temp2);
        } else {
            System.out.println("WAR!");
            if (isGameOver()) {
                if (player1.personalDeck.size() > 0) {
                    System.out.println("Player 1 wins the game after " + rounds + " rounds!");
                } else {
                    System.out.println("Player 2 wins the game after " + rounds + " rounds!");
                }
            }else if (player1.personalDeck.size() < 4 || player2.personalDeck.size() < 4) {
                if (player1.personalDeck.size() < 4) {
                    for (int i = 1; i <= player1.personalDeck.size(); i++) {
                        temp1.add(player1.dealCards());
                    }
                } else {
                    for (int i = 1; i <= player2.personalDeck.size(); i++) {
                        temp2.add(player2.dealCards());
                    }
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    temp1.add(player1.dealCards());
                    temp2.add(player2.dealCards());
                }
            }
            playRound(temp1, temp2);
        }
    }
    private boolean isGameOver() {
        return player1.personalDeck.isEmpty() || player2.personalDeck.isEmpty();
    }
}
