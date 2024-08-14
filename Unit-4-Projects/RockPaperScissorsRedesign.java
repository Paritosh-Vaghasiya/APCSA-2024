import java.util.Scanner;
public class RockPaperScissorsRedesign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "", option = "",input = "";
        int optionNum = 0, computerScore = 0, playerScore = 0, tieCounter = 0, rounds = 0;

        do{
            //Creating a random value
            optionNum = (int) (Math.random()*3)+1;
            if (optionNum == 1) {
                option = "Rock";
            } else if (optionNum == 2) {
                option = "Paper";
            } else {
                option = "Scissor";
            }

            //Asking for input
            System.out.println("Type one these correctly ->  Rock, Paper, Scissor");
            input = scan.nextLine();

            //Output
            System.out.println("Computer picked: " + option);
            System.out.println("You picked: " + input);

            //Deciding who won
            if (input.equals(option)) {
                System.out.println("Tie");
                tieCounter++;
            } else if ((input.equals("Rock")) && option.equals("Scissor")){
                System.out.println("User wins");
                playerScore++;
            }  else if ((input.equals("Scissor")) && option.equals("Paper")){
                System.out.println("User wins");
                playerScore++;
            }  else if ((input.equals("Paper")) && option.equals("Rock")){
                System.out.println("User wins");
                playerScore++;
            }  else if ((input.equals("Rock")) && option.equals("Paper")){
                System.out.println("Computer wins");
                computerScore++;
            }  else if ((input.equals("Scissor")) && option.equals("Rock")){
                System.out.println("Computer wins");
                computerScore++;
            }  else{
                System.out.println("Computer wins");
                computerScore++;
            }

            //Track number of rounds
            rounds++;

            //Asking to continue
            System.out.println();
            System.out.println("Do you want to play - y or n ");
            answer = scan.nextLine();
            System.out.println();

        }while(answer.equals("y"));
        System.out.println("Thanks for playing");
        System.out.println("Computer won: " + computerScore);
        System.out.println("You won: " + playerScore);
        System.out.println("There were " + tieCounter + " ties");
        System.out.println("You played " + rounds + " round");
    }
}
