import java.util.Scanner;
public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year");
        int inputYear = scan.nextInt();

        //Checking
        boolean leap = false;
        if ((inputYear % 4 == 0) && (inputYear % 100 != 0)){
            leap = true;
        } else if (inputYear % 400 == 0){
            leap = true;
        } else {
            leap = false;
        }

        //Output
        if(leap){
            System.out.println(inputYear + " is a leap year");
        } else {
            System.out.println(inputYear + " isn't a leap year");
        }
    }
}
