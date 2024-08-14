package DeckClass;
public class Card {
    private int faceNum, pick1, pick2;
    private String suit;
    private String[] suitName, faceValue;
    public Card(int suit, int faceNum){
        faceValue = new String[14];
        for (int i = 0; i < 14; i++) {
            if(i==10){
                faceValue[i] = "Jack";
            } else if (i == 11){
                faceValue[i] = "Queen";
            } else if (i == 12){
                faceValue[i] = "King";
            } else if (i == 13){
                faceValue[i] = "Ace";
            } else {
                faceValue[i] = String.valueOf(i+1);
            }
        }
        suitName = new String[4];
        suitName[0] = "Diamonds";
        suitName[1] = "Hearts";
        suitName[2] = "Clubs";
        suitName[3] = "Spades";

        this.faceNum = faceNum - 1;
        this.suit = suitName[suit-1];
    }
    public int getFaceNum() {
        return faceNum;
    }
    public String getSuit() {
        return suit;
    }
    public int compareTo(Card card){
        pick1 = this.getFaceNum();
        pick2 = card.getFaceNum();
        if(pick1 == pick2){
            return 0;
        } else if (pick1 > pick2){
            return 1;
        } else {
            return -1;
        }
    }
    public String toString(){
        return faceValue[faceNum] + " of " + suit;
    }
}
