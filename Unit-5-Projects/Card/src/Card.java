public class Card {
    private int suit, faceNum;
    private String suitName, faceValue;
    public Card(){
        suit = (int)(Math.random()*4);
        faceNum = (int)(Math.random()*14);
    }
    public Card(int suit, int faceNum){
        this.suit = suit;
        this.faceNum = faceNum;
    }
    public String getSuit(){
        if (suit == 0){
            suitName = "Spade";
        } else if (suit == 1){
            suitName = "Diamond";
        } else if (suit == 2){
            suitName = "Club";
        } else {
            suitName = "Heart";
        }
        return suitName;
    }
    public String getFaceValue(){
        if (faceNum == 0){
            faceValue = "A";
        } else if (faceNum == 1){
            faceValue = "1";
        } else if (faceNum == 2){
            faceValue = "2";
        } else if (faceNum == 3){
            faceValue = "3";
        } else if (faceNum == 4){
            faceValue = "4";
        } else if (faceNum == 5){
            faceValue = "5";
        } else if (faceNum == 6){
            faceValue = "6";
        } else if (faceNum == 7){
            faceValue = "7";
        } else if (faceNum == 8){
            faceValue = "8";
        } else if (faceNum == 9){
            faceValue = "9";
        } else if (faceNum == 10){
            faceValue = "10";
        } else if (faceNum == 11){
            faceValue = "J";
        } else if (faceNum == 12){
            faceValue = "Q";
        } else {
            faceValue = "K";
        }
        return faceValue;
    }
    public String toString(){
        return "Your card is the " + getFaceValue() + " of " + getSuit();
    }
}
