public class Dog {
    // Instance Var
    private int age;
    private String breed;
    private String furColor;

    //Default Constructor
    public Dog(){
        // Initalise instance var
        age =0;
        breed ="";
        furColor="";
    }

    //Alternative constructor
    public Dog(int newAge, String newBreed, String newFurColor){
        age = newAge;
        breed = newBreed;
        furColor = newFurColor;
    }

    //Accessor Methods
    public int getAge(){return age;}
    public String getBreed(){return breed;}
    // AP Way of writing
    public String getFurColor()
    {
        return furColor;
    }

    //Mutator Methods
    public void setAge(int newAge){age=newAge;}
    public void setBreed(String newBreed){breed=newBreed;}
    // AP Way of writing
    public void setFurColor(String newFurColor) {
        furColor=newFurColor;
    }

}

