import java.util.Scanner;

public class NestedForLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++)
                System.out.print("*  ");
            System.out.println(); //Just a fun little return character
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            for (int j = i; j < 10; j++)
                System.out.print("*  ");
            System.out.println(); //Just a fun little return character
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            for (int j = i ; j > 0; j--)
                System.out.print("*  ");
            System.out.println(); //Just a fun little return character
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++)
                if((int)(Math.random()*10) == j)
                    System.out.print(j+"  ");
                else
                    System.out.print("x ");
            System.out.println(); //Just a fun little return character
        }
        System.out.println();
    }
}
