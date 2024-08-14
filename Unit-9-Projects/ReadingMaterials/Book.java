package ReadingMaterials;
public class Book extends ReadingMaterial{
    private String type;

    public Book(){
        super();
        type = "";
    }

    public Book(String title, String price, String type){
        super(title, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String readingMaterial() {
        return "Book";
    }

    public String toString(){
        return super.toString() + ", Type: "  + type;
    }
}
