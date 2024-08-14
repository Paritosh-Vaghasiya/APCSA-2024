package MoreClasses;
public class Address {
    private String street, city, state;
    public Address(){
        street = "";
        city = "";
        state = "";
    }
    public Address(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
    //Accessor methods
    public String getStreet(){return street;}
    public String getCity(){return city;}
    public String getState(){return state;}
    //Mutator methods
    public void setState(String state){this.state = state;}
    public void setCity(String city){this.city = city;}
    public void setStreet(String street){this.street = street;}
    //ToString methods
    public String toString(){
        return street + "\n " +city + ", " + state;

    }
}
