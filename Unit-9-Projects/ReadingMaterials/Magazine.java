package ReadingMaterials;
public class Magazine extends ReadingMaterial{
    private String genre;

    public Magazine(){
        super();
        genre = "";
    }

    public Magazine(String title, String price, String genre){
        super(title, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String readingMaterial() {
        return "Magazine";
    }

    public String toString(){
        return super.toString() + ", Genre: " + genre;
    }
}
