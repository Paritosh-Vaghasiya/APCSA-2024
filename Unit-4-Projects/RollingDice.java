public class RollingDice {
    public static void main(String[] args) {
        int numRolls = (int)(Math.random()*9001)+1000;
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0, count9 = 0, count10 = 0, count11 = 0, count12 = 0;
        int rollCounter = 0;
        for (int i = 0; i < numRolls; i++) {
            int dice1 = (int)(Math.random()*6)+(int)(Math.random()*6)+2;

            if(dice1 == 2){
                count2++;
            } else if (dice1 == 3){
                count3++;
            } else if (dice1 == 4){
                count4++;
            } else if (dice1 == 5){
                count5++;
            } else if (dice1 == 6){
                count6++;
            } else if (dice1 == 7){
                count7++;
            } else if (dice1 == 8){
                count8++;
            } else if (dice1 == 9){
                count9++;
            } else if (dice1 == 10){
                count10++;
            } else if (dice1 == 11){
                count11++;
            } else {
                count12++;
            }
            rollCounter++;
        }
        System.out.println("You rolled " + rollCounter +" times");
        System.out.println("You had " + count2 + " twos, " + count3 + " threes, " + count4 + " fours, " + count5 + " fives, " + count6 + " sixes, " + count7 + " sevens, " + count8 + " eights, " + count9 + " nines, " + count10 + " tens, "+ count11 + " elevens," + count12 + " twelves" );
    }
}
