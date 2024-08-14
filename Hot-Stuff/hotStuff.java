import java.util.Scanner;

public class hotStuff {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the Fahrenheit value:");

        int tempF = scan.nextInt();
        double tempC = ((double)5/9) *(tempF-32);

        System.out.println("Celcius value is: " + String.format("%.2f",tempC));
    }
}
