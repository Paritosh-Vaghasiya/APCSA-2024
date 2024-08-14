package ReadingMaterials;
public class Novel extends ReadingMaterial{
    private String cover;

    public Novel(){
        super();
        cover = "";
    }

    public Novel(String title, String price, String cover){
        super(title, price);
        this.cover = cover;
    }

    public String getSubject() {
        return cover;
    }

    public String readingMaterial() {
        return "Novel";
    }

    public String toString(){
        return super.toString() + ", Cover: " + cover;
    }
}
