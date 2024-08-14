import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {
    private Deck deck;
    private Player player, dealer;
    private Scanner scan;
    private int roundNumber;
    private ArrayList<Card> discardDeck;

    public BlackJack() {
        deck = new Deck();
        player = new Player();
        dealer = new Player();
        scan = new Scanner(System.in);
        roundNumber = 1;
        discardDeck = new ArrayList<>();
        startGame();
    }

    public void startGame() {
        boolean play = true;
        while (play) {
            System.out.println("Round " + roundNumber);
            System.out.println("--------");
            roundNumber++;
            shuffle();
            dealCards();
            playerTurn();
            dealerTurn();
            winner();
            discard();
            if (deck.getSize() < 10) {
                System.out.println("Reshuffle");
                reshuffle();
            }
            System.out.println("Do you want to play another round? (y/n)");
            String input = scan.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                play = false;
            }
            System.out.println();
        }
    }

    private void shuffle() {
        for (int i = 0; i < 4; i++) {
            deck.shuffleDeck();
        }
    }

    private void dealCards() {
        for (int i = 0; i < 2; i++) {
            player.acceptCards(deck.dealCard());
            dealer.acceptCards(deck.dealCard());
        }
    }

    private void playerTurn() {
        boolean flag = true;
        while (flag) {
            System.out.println("Your hand: " + player);
            System.out.println("Your total: " + handValue(player));
            System.out.println("Dealer's hand: " + dealer.getDealerHand());
            System.out.println("Do you want to hit or stand? (h/s)");
            String input = scan.nextLine();
            if (input.equals("h")) {
                player.acceptCards(deck.dealCard());
                if (handValue(player) > 21) {
                    System.out.println("Bust! You lose.");
                    flag = false;
                }
            } else if (input.equals("s")) {
                flag = false;
            } else {
                System.out.println("Invalid choice, please enter 'h' or 's'.");
            }
            System.out.println();
        }
        System.out.println("Deck size: " + deck.deckLength());
        System.out.println();
    }

    private void dealerTurn() {
        while (handValue(dealer) < 17) {
            dealer.acceptCards(deck.dealCard());
        }
    }

    private void winner() {
        int playerValue = handValue(player);
        int dealerValue = handValue(dealer);
        System.out.println("Your hand: " + player);
        System.out.println("Dealer's hand: " + dealer);
        System.out.println("Your total: " + playerValue);
        System.out.println("Dealer's total: " + dealerValue);
        if (playerValue > 21) {
            System.out.println("Bust! You lose.");
        } else if (dealerValue > 21 || playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie.");
        }
    }

    private int handValue(Player person){
        int total = 0;
        boolean ace = false;

        for (Card card : person.getPersonalDeck()) {
            int value = card.getNums();
            if (value == 11) {
                ace = true;
                total += 1; // Count ace as 1 initially
            } else if (value >= 12 && value <= 14) {
                total += 10; // Face cards (Jack, Queen, King) are worth 10
            } else {
                total += value;
            }
        }

        // Adjust for aces if beneficial
        while (ace && total + 10 <= 21) {
            total += 10;
            ace = false;
        }

        return total;
    }

    private void discard() {
        discardDeck.addAll(player.getPersonalDeck());
        discardDeck.addAll(dealer.getPersonalDeck());
        player = new Player();
        dealer = new Player();
    }

    private void reshuffle() {
        for (Card card : discardDeck) {
            deck.acceptCards(card);
        }
        discardDeck.clear();
        shuffle();
    }
}