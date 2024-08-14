public class Card {
    private int nums;
    private String suit, faceNum;

    public Card(int suit, int faceNum) {
        this.faceNum = getFaceValue(faceNum);
        this.suit = getSuitName(suit);
        this.nums = faceNum;
    }

    private String getFaceValue(int faceNum) {
        if (faceNum == 11) {
            return "Jack";
        } else if (faceNum == 12) {
            return "Queen";
        } else if (faceNum == 13) {
            return "King";
        } else if (faceNum == 14) {
            return "Ace";
        } else {
            return String.valueOf(faceNum);
        }
    }

    private String getSuitName(int suit) {
        String[] suitName = {"Diamonds", "Hearts", "Clubs", "Spades"};
        return suitName[suit - 1];
    }

    public int getNums() {
        if (nums >= 11 && nums <= 13) {
            return 10;
        } else if (nums == 14) {
            return 11;
        } else {
            return nums;
        }
    }

    public String getSuit() {
        return suit;
    }

    public int compareTo(Card card) {
        int pick1 = this.getNums();
        int pick2 = card.getNums();
        if (pick1 == pick2) {
            return 0;
        } else if (pick1 > pick2) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return faceNum + " of " + suit;
    }
}