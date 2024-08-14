import java.util.Scanner;

public class hotDiggityDog {
    public static void main(String[]args){
        double price = 2.50;
        double tax = 0.07;
        Scanner scan = new Scanner(System.in);

        System.out.println("How many hot dogs do you want?");
        int amount = scan.nextInt();

        double cost = price*amount;
        float totalTax = (float) ((cost)*tax);
        float total = (float) (cost + totalTax);

        System.out.println("Your price without tax: " + cost);
        System.out.println("Your tax is: " +  String.format("%.2f",totalTax));
        System.out.println("Your total price is: " + String.format("%.2f",total));
    }
}
