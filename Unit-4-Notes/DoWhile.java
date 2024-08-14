import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        // The do ... while loop is a post test loop
        // The loop will ALWAYS execute AT LEAST once
        // The condition is not tested until the very end

        Scanner scan = new Scanner(System.in);
        int count = 0, sum = 0, num = 0;
        do{
            count++;
            sum += num;
            System.out.println("Enter a number between 1 and 10, or -999 to quit");
            num = scan.nextInt();
        }while(num != -999);
        System.out.println("Your sum was: " + sum);
        System.out.println("Your count was: " + count);
        System.out.println("Your avg. was: " + ((double)sum/count));

        //Avg of even
        System.out.println();
        count = 0;
        sum = 0;
        num = 0;
        do{
            System.out.println("Enter a number between 1 and 10, or -999 to quit");
            num = scan.nextInt();
            if (num % 2 == 0){
                count++;
                sum += num;
            }
        }while(num != -999);
        System.out.println("Your sum was: " + sum);
        System.out.println("Your count was: " + count);
        System.out.println("Your avg. was: " + ((double)sum/count));
    }
}
