package MoreClasses;
public class Name {
    private String first, middle, last;

    public Name(){
        first = "";
        middle = "";
        last = "";
    }
    public Name(String first, String middle, String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    //Accessor methods
    public String getFirst(){return first;}
    public String getMiddle(){return middle;}
    public String getLast(){return last;}
    //Mutator methods
    public void setFirst(String first){this.first = first;}
    public void setMiddle(String middle){this.middle = middle;}
    public void setLast(String last){this.last = last;}
    //ToString
    public String toString() {
        return first + " " + middle + " " + last;
    }
}
