package MoreClasses;
public class Person {
    private Name name;
    private Address address;

    public Person(){
        name = null;
        address = null;
    }
    public Person(Name name, Address address){
        this.name = name;
        this.address = address;
    }
    public String toString(){
        return name.toString() + "\n " + address.toString();
    }
    public void newName(String first, String middle, String last){
        name.setFirst(first);
        name.setMiddle(middle);
        name.setLast(last);
    }
    //Accessor method
    public Name getName(){return name;}
    public Address getAddress(){return address;}
}
