package MoreClasses;
public class Driver {
    public static void main(String[] args) {
        Name bob = new Name("Steve", "Robert", "Smith");
        Address here = new Address("1100 Schaumburg Rd", "Schaumburg", "Illinois");
        System.out.println(bob);
        System.out.println(here);
        Person who = new Person(bob, here);
        System.out.println(who);
        Person who2 = new Person(new Name("Evan", "Dev", "Darsh"), new Address("123 pine", "EG","IL"));
        System.out.println(who2);
        Name what = who.getName();
        System.out.println(what);
        System.out.println(who2.getAddress());

    }
}
