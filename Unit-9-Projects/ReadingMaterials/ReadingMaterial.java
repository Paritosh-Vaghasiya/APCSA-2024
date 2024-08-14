package ReadingMaterials;
public class ReadingMaterial {
    private String title;
    private String price;

    public ReadingMaterial(){
        title="";
        price="";
    }

    public ReadingMaterial(String title, String price){
        this.title = title;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String readingMaterial(){
        return "Reading Material";
    }

    @Override
    public String toString() {
        return readingMaterial() + ": Title: " + title + ", Price: " + price;
    }
}
