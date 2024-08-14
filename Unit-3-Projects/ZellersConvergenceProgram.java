import java.util.Scanner;
public class ZellersConvergenceProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Var
        int year, m, q, K, J, h;

        //Input
        System.out.println("Enter the year:");
        year = scan.nextInt();
        System.out.println("Enter the month (1-12):");
        m = scan.nextInt();
        System.out.println("Enter the day of the month (1-31):");
        q = scan.nextInt();

        //Setting up
        K = year%100;//Year of the century
        J = year/100;//Zero-based century

        if(m==1){
            m=13;
            K=K-1;
        } else if (m == 2) {
            m=14;
            K=K-1;
        }

        //Formula
        h=(q+((13*(m+1)/5))+K+(K/4)+(J/4)+5*J)%7;
      
        //Output
        if (h == 0){
            System.out.println("The day of the week is Saturday");
        } else if (h == 1){
            System.out.println("The day of the week is Sunday");
        } else if (h == 2){
            System.out.println("The day of the week is Monday");
        } else if (h == 3){
            System.out.println("The day of the week is Tuesday");
        } else if (h == 4){
            System.out.println("The day of the week is Wednesday");
        } else if (h == 5){
            System.out.println("The day of the week is Thursday");
        } else if (h == 6){
            System.out.println("The day of the week is Friday");
        }
    }
}
