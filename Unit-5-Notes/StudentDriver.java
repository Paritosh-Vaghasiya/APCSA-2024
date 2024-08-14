public class StudentDriver {
    public static void main(String[] args) {
        Student bob = new Student(); //using the default constructor
        System.out.println(bob); //Status of the object bob
        Student jill = new Student("Jill", "1100 Schaumburg Rd", "Schaumburg");
        System.out.println(jill); //Status of the object jill
        Student mary = jill; //AP problem
        System.out.println(mary); //Status of the object mary
        System.out.println(jill.getName() + " " + jill.getAddress() + " " + jill.getCity()); //Status of the object jill
        System.out.println(mary.getName() + " " + mary.getAddress() + " " + mary.getCity()); //Status of the object mary
        jill.setName("Theresa");
        System.out.println(jill.getName() + " " + jill.getAddress() + " " + jill.getCity()); //Status of the object jill
        System.out.println(mary.getName() + " " + mary.getAddress() + " " + mary.getCity()); //Status of the object mary
        mary.setAddress("1200 e Schaumburg");
        System.out.println(jill.getName() + " " + jill.getAddress() + " " + jill.getCity()); //Status of the object jill
        System.out.println(mary.getName() + " " + mary.getAddress() + " " + mary.getCity()); //Status of the object mary











    }
}