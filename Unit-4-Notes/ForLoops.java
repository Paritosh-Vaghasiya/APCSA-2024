import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // A for loop is an iterative looping structure
        // Use it when you know how long something is to run

        int count = 0;
            //initializer; test condition; iterator
            // set i to a value; check to see if i is true; make i bigger or smaller
        for(int i = 0; i < 10; i++){
            count++;
        }
        System.out.println("The for loop ran: " + count + " times");

        int count1 = 0, sum = 0;
        for (int j = 0; j < 15; j++){
            count1++;
            sum += j;
        }
        System.out.println("The loop ran " + count1 + " times and its sum was " + sum);

        // A for loop counting down
        int sum1 = 0;
        for (int k = 13; k > 0; k--){
            sum1 += k;
            System.out.println("k is: " + k + " The current sum is: " + sum1);
        }

        // Count up by numbers that are more than 1
        int sum2 = 0;
        for (int m = 0; m < 100; m += 5){
            sum2 += m;
            System.out.println("m is: " + m + " The current sum is: " + sum2);
        }

        // Adding up user input
        int sum3 = 0, start = 0, end = 0;
        System.out.println("What is our starting number?");
        start = scan.nextInt();
        System.out.println("What is our ending number?");
        end = scan.nextInt();
        for (int n = start; n < end + 1; n++){
            sum3 += n;
            System.out.println("n is: " + n + " The current sum is " + sum3);
        }

        //let's roll some dice
        for (int p = 0; p < 10; p++){
            int rand = (int)(Math.random()*6)+1;
            System.out.println("You rolled a: " + rand);
        }

        //playing with Strings
        String mary = "supercalfrajalisticexpealadotious";
        for (int q = 0; q<mary.length(); q++){
            System.out.println(mary.charAt(q));
            for (int r = 0; r<2000000000; r++){
            }
        }
    }
}
