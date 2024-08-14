import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = (int)(Math.random()*100);
        int input = 0, guessCounter = 0;

        do {
            System.out.println("Guess a number between 0 - 99: ");
            input = scan.nextInt();
            guessCounter++;
            if(rand > input){
                System.out.println("Guess Higher");
                System.out.println();
            }
            if (rand < input){
                System.out.println("Guess Lower");
                System.out.println();
            }
        }while(input != rand);
        System.out.println("You got it right");
        System.out.println("You guessed " + guessCounter + " numbers of times");
    }
}
