import java.util.Scanner;
public class RockPaperScissorsProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Creating a random value
        int optionNum = (int) (Math.random()*3)+1;
        String option;
        if (optionNum == 1) {
            option = "Rock";
        } else if (optionNum == 2) {
            option = "Paper";
        } else {
            option = "Scissor";
        }
        //Asking for input
        System.out.println("Type one these correctly ->  Rock, Paper, Scissor");
        String input = scan.nextLine();

        //Output
        System.out.println("Computer picked: " + option);
        System.out.println("You picked: " + input);

        //Deciding who won
        if (input.equals(option)) {
            System.out.println("Tie");
        } else if ((input.equals("Rock")) && option.equals("Scissor")){
            System.out.println("User wins");
        }  else if ((input.equals("Scissor")) && option.equals("Paper")){
            System.out.println("User wins");
        }  else if ((input.equals("Paper")) && option.equals("Rock")){
            System.out.println("User wins");
        }  else if ((input.equals("Rock")) && option.equals("Paper")){
            System.out.println("Computer wins");
        }  else if ((input.equals("Scissor")) && option.equals("Rock")){
            System.out.println("Computer wins");
        }  else{
            System.out.println("Computer wins");
        }
    }
}
