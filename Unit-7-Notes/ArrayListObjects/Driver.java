package ArrayListObjects;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Car> auto = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String  make="", model="";
        int year=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter year of the car");
            year = Integer.parseInt(scan.nextLine());
            System.out.println("Enter make of the car");
            make = scan.nextLine();
            System.out.println("Enter model of the car");
            model = scan.nextLine();
            auto.add(new Car(year, make, model));
        }
        for(Car anthony:auto){
            System.out.println(anthony);
        }
    }
}
