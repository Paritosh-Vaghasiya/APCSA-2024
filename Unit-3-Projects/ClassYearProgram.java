import java.util.Scanner;
public class ClassYearProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //input
        System.out.println("What year are you in (1,2,3,4)?");
        int inputNum = scan.nextInt();

        if (inputNum == 1) {
            System.out.println("You are a Freshman");
        } else if (inputNum == 2) {
            System.out.println("You are a Sophomore");
        } else if (inputNum == 3) {
            System.out.println("You are a Junior");
        } else if (inputNum == 4) {
            System.out.println("You are a Senior");
        } else {
            System.out.println("Invalid input");
        }
    }
}
