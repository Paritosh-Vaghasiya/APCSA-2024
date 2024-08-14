package Inheritance;
public class MoneyMarket extends BankAccount{
    private double interest;

    private String nothing;

    public MoneyMarket(){
        super(); //call the BankAccount default constructor;
        interest = 0.05;
    }

    public MoneyMarket (String name, double balance, double interest){
        super(name, balance); //call the BankAccount constructor with name and balance
        this.interest = interest;
        nothing = "quit";
    }

    public void addInterest() {
        deposit(getBalance()*interest);
    }

    public String getNothing() {
        return nothing;
    }

    public String getSuperNothing() {
        return super.nothing;
    }

    public String toString() {
        return super.toString() + " interest rate of " + (100*interest)+"%";
    }
}
