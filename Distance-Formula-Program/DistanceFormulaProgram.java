import java.util.Scanner;
public class DistanceFormulaProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Point one x
        System.out.println("What is the is x1 value?");
        int x1 = scan.nextInt();
        //Point one y
        System.out.println("What is the is y1 value?");
        int y1 = scan.nextInt();
        //Point two x
        System.out.println("What is the is x2 value?");
        int x2 = scan.nextInt();
        //Point two y
        System.out.println("What is the is y2 value?");
        int y2 = scan.nextInt();
        //Formula
        double dist = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        System.out.println(dist);
    }
}
