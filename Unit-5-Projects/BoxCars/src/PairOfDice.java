public class PairOfDice {
    private int dice1, dice2;

    public PairOfDice(){
        dice1 = (int)(Math.random()*6)+1;
        dice2 = (int)(Math.random()*6)+1;
    }

    public boolean isBoxCar(){
        boolean flag = false;
        if (dice1 == 6 && dice2 == 6){
            flag = true;
        }
        return flag;
    }

}
