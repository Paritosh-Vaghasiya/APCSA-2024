package StoringObjects;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        People[] person = new  People[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < person.length; i++) {
            System.out.println("Enter a name");
            String name = scan.nextLine();
            System.out.println("Enter age");
            int age = Integer.parseInt(scan.nextLine());
            person[i] = new People(name, age);//Creates a generic People object and stores it
        }
        for(People persons:person){
            System.out.println(persons);
        }
    }
}
