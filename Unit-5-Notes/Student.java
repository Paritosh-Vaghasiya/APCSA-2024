public class Student {
    private String name, address, city;

    public Student(){
        name = "";
        address ="";
        city = "";
    }

    public Student(String name, String address, String city){ // alternate constructor
        this.name = name; // this refers to the private strings at the top of the code while "name" refers to the parameter
        this.address = address;
        this.city = city;
    }

    //Accessor methods
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }

    //Mutator methods
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void  setCity(String city){
        this.city = city;
    }

    public String toString(){
        return "Name: " + name + " Address: " + address + " City: " + city;
    }//this is what we want to print out when we want to know the status of the object
}
