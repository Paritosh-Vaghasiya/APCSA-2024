public class RollingDice {
    public static void main(String[] args){
        int roll1 = (int)(Math.random()*6)+1;
        int roll2 = (int)(Math.random()*6)+1;
        System.out.println("Roll one is: " + roll1);
        System.out.println("Roll two is: " + roll2);
        int total = roll1 + roll2;
        System.out.println("Total is: " + total);
    }
}
