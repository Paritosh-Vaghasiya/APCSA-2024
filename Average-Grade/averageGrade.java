import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats score one");
        int score1 = scan.nextInt();
        System.out.println("Whats score two");
        int score2 = scan.nextInt();
        System.out.println("Whats score three");
        int score3 = scan.nextInt();
        double avg = ((double) (score1 + score2 + score3) /3);
        System.out.println("Average is: " + avg);

    }
}
