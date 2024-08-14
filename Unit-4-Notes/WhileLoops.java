import java.util.Scanner;
public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int num = scan.nextInt();
        while (num < 1 || num > 10){
            System.out.println("Please enter a number between 1 and 10");
            num = scan.nextInt();
        }
        System.out.println("You entered: " + num);

        //Average a bunch of numbers
        System.out.println("Let's Average some numbers");
        System.out.println("Enter your 1st number");
        int num1 = scan.nextInt();
        int sum = 0, count = 0;
        while (num1 != -999){
            sum+=num1;
            count++;
            System.out.println("Enter another number or -999 to quit");
            num1 = scan.nextInt();
        }
        System.out.println("The average was: " + (sum/count));

        //Here's the problem with the scanner class
        //using nextInt() theaves the return character on the
        // line and if you grab a string it kills it
        scan.nextInt();//grap the return character
        System.out.println("Enter y to keep going and n to quit");
        String response = scan.nextLine();
        while (response.equals("y")){
            System.out.println("Enter y to keep going and n to quit");
            response = scan.nextLine();
        }
    }
}
