package SortingPerson;
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Person> name = new ArrayList<>();
        Person p1 = new Person("Paritosh", "Vaghasiya", 16 );
        name.add(p1);
        Person p2 = new Person("Darsh", "Mewade", 14 );
        name.add(p2);
        Person p3 = new Person("Evan", "Pikscher", 13 );
        name.add(p3);
        Person p4 = new Person("Ishaan", "Patel", 18 );
        name.add(p4);
        Person p5 = new Person("Roshan", "Gunuganti", 17 );
        name.add(p5);

        for (Person ppl :  name){
            System.out.println(ppl);
        }

        sort(name);
    }

    public static void sort(ArrayList<Person> list){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sort by age or name?");
        String input = scan.nextLine();
        if (input.equals("age")){
            for (int j = 0; j < list.size()-1; j++) {
                for (int k = 0; k < list.size() - 1; k++) {
                    if ((list.get(k).getAge() > list.get(k + 1).getAge())) {
                        Person temp = list.get(k);
                        list.set(k, list.get(k + 1));
                        list.set(k + 1, temp);
                    }
                }
            }
        }

        if (input.equals("name")){
            for (int j = 0; j < list.size()-1; j++) {
                for (int k = 0; k < list.size() - 1; k++) {
                    if ((list.get(k).getLastName().compareTo(list.get(k + 1).getLastName()) >= 1 )) {
                        Person temp = list.get(k);
                        list.set(k, list.get(k + 1));
                        list.set(k + 1, temp);
                    }
                }
            }
        }

        for (Person ppl : list){
            System.out.println(ppl);
        }
    }
}
