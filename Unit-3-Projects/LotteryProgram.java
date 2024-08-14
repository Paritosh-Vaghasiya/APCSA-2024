import java.util.Scanner;
public class LotteryProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Generating Winning num
        int win = (int) (Math.random()*90)+10;
        int winDigitOne = win/10;
        int winDigitTwo = win%10;

        //Getting input
        System.out.println("Lottery 2-digit number");
        int guess = scan.nextInt();
        int guessDigitOne = guess/10;
        int guessDigitTwo = guess%10;

        //Deciding
        if(guess == win){
            System.out.println("You win $10,000");
        } else if ((guessDigitOne==winDigitTwo) && (guessDigitTwo==winDigitOne)){
            System.out.println("You win $3,000");
        } else if ((guessDigitOne==winDigitOne) || (guessDigitOne==winDigitTwo) || (guessDigitTwo==winDigitOne) || (guessDigitTwo==winDigitTwo)) {
            System.out.println("You win $1,000");
        } else {
            System.out.println("You win nothing");
        }
    }
}
