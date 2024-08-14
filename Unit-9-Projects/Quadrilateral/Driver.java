package Quadrilateral;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter: '" + 1 + "' for Quadrilateral, '" + 2 + "' for Parallelogram, '" + 3 + "' for Rectangle, '" + 4 + "' for Square, '" + 5 + "' to Quit");
            choice = scan.nextInt();

            if (choice == 1) {
                Quadrilateral quadrilateral = new Quadrilateral();
                System.out.println(quadrilateral);
            } else if (choice == 2) {
                Parallelogram parallelogram = new Parallelogram(true, true, true);
                System.out.println(parallelogram);
            } else if (choice == 3) {
                Rectangle rectangle = new Rectangle(true);
                System.out.println(rectangle);
            } else if (choice == 4) {
                Square square = new Square();
                System.out.println(square);
            }else{
                System.out.println("Thank You");
            }
        } while (choice != 5);
    }
}
