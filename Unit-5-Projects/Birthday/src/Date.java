public class Date {
    private int day, month, year;
    public Date(){
        day = 0;
        month = 0;
        year = 0;
    }
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "Your Birthday is: " + day + "/" + month + "/" + year;
    }
}
