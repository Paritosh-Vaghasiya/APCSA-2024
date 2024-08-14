public class BoxCars {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            PairOfDice game = new PairOfDice();
            if (game.isBoxCar()){
                count++;
            }
        }
        System.out.println("You had " + count + " # of Box Cars");
    }
}
