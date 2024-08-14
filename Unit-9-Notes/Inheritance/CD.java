package Inheritance;
public class CD extends MoneyMarket{
    private int months;
    public CD(){
        super();
        months = 3;
    }

    public CD(String name, double balance, double interest, int months){
        super(name, balance, interest);
        this.months = months;
    }

    public String toString(){
        return super.toString() + " months of " + months;
    }
}
