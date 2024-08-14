import java.util.Scanner;
public class TriangleEdgesProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Inputs
        System.out.println("What is length of side 1?");
        double x = scan.nextDouble();
        System.out.println("What is length of side 2?");
        double y = scan.nextDouble();
        System.out.println("What is length of side 3?");
        double z = scan.nextDouble();

        //Output
        if ((x+y>z) && (x+z>y) && (y+z>x)){
            System.out.println("Is a triangle");
        } else {
            System.out.println("Isn't a triangle");
        }
    }
}
