import java.util.Scanner;
public class AreaAndCircumference {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the radius?");
        double rad = scan.nextDouble();
        double area = Math.PI*Math.pow(rad,2);
        double circum = 2 * Math.PI * rad;
        System.out.println("The area is: " + area);
        System.out.println("The circumference is: " + circum);
    }
}
