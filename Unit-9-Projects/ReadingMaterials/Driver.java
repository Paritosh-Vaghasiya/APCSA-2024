package ReadingMaterials;
public class Driver {
    public static void main(String[] args) {
        ReadingMaterial read = new ReadingMaterial("One", "1");
        System.out.println(read);
        Book read1 = new Book("Two", "2", "Fiction");
        System.out.println(read1);
        Novel read2 = new Novel("Three", "3", "Soft");
        System.out.println(read2);
        Magazine read3 = new Magazine("Four", "4", "Sci-fi");
        System.out.println(read3);
        Textbook read4 = new Textbook("Five", "5", "CS");
        System.out.println(read4);
    }
}
