public class AndOrs {
    public static void main(String[] args){
        /*
        AND - &&
        OR - ||
        NOT - !
         */

        String anthony = "Is he listening to me?";
        int x = 1, y = 2, z = 3;
        boolean flag = true;
        //Set up conditonal statments
        if(x > 0){
            flag = false;
        }
        if(x < z){
            flag =false;
        }
        //Alternative version of these staements would be:
        if(x > 0 || x < z){
            flag = false;
        }
        if(x < 0 && x > z){
            flag = true;
        }
        //Rolling dice
        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        System.out.println("Dice 1 " + dice1);
        System.out.println("Dice 2 " + dice2);
        if(dice1 > 5 && dice2>5){
            System.out.println("YOu got boxcars, that's 2 6's");
        }else if((dice1 + dice2)%2 == 0) {
            System.out.println("Your sum was even");
        }else if((dice1 %2 != 0) || (dice2 % 2 == 0)){
            System.out.println("Your sum was odd ");
        }else{
            System.out.println("I don't know");
        }

        /*
        DeMorgan's Laws
        !(A && B) = !A || !B
        !(A || B) == !A && !B
        This WILL be an AP MCQ
         */
        boolean A = false, B = true;
        boolean flag1 = true;
        flag1 = !(A && B);
        System.out.println("Flag1 is "+flag1);
        System.out.println(!A || !B);
        System.out.println(!(A || B));
        System.out.println(!A && !B);
    }
}
