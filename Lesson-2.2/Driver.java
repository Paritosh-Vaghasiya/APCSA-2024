public class Driver {
    public static void main(String[] args){
        Dog spot = new Dog();//uses the default contructor
        System.out.println("Spot's age is: " + spot.getAge());
        spot.setAge(3);
        System.out.println("Spot's age is: " + spot.getAge());
        spot.setAge(21);
        System.out.println("Spot's age is: " + spot.getAge());
        Dog hollie = new Dog(4, "Cavapoo", "Orangish-Brown");
        System.out.println("Hollie's age is: " + hollie.getAge());
        System.out.println("Hollie's breed is: " + hollie.getBreed());
        System.out.println("Hollie's coloring is: " + hollie.getFurColor());
        hollie.setFurColor("Blue");
        System.out.println("Hollie's coloring is: " + hollie.getFurColor());
    }
}
