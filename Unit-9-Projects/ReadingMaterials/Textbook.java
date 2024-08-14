package ReadingMaterials;
public class Textbook extends ReadingMaterial{
    private String subject;

    public Textbook(){
        super();
        subject = "";
    }

    public Textbook(String title, String price, String subject){
        super(title, price);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public String readingMaterial() {
        return "Textbook";
    }

    public String toString(){
        return super.toString() + ", Subject: " + subject;
    }
}
