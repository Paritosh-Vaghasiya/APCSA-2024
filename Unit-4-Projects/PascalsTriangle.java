import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        //Var
        Scanner scan = new Scanner(System.in);

        //Asking for input
        System.out.println("How many rows do you want to see");
        int lines = scan.nextInt();

        for (int i = 0; i < lines; i++) {
            int out = 1;
            System.out.print(" " + out);
            for (int j = 1; j <= i; j++) {
                out = out * (i - j + 1) / j;
                System.out.print(" " + out);
            }
            System.out.println();
        }
    }
}
