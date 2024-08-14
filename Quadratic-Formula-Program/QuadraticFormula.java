import java.util.Scanner;
public class QuadraticFormula {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //a
        System.out.println("What is the a?");
        double a = scan.nextDouble();
        //b
        System.out.println("What is the b?");
        double b = scan.nextDouble();
        //c
        System.out.println("What is the c?");
        double c = scan.nextDouble();
        //Quadratic Equation
        double determinant = (Math.pow(b,2)) - 4 * a * c;
        double root1 = (-b + Math.sqrt(determinant))/(2*a);
        double root2 = (-b - Math.sqrt(determinant))/(2*a);
        System.out.println("Roots are: " + root1 + " and " + root2);
    }
}
