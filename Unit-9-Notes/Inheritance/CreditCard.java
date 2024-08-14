package Inheritance;

public class CreditCard extends BankAccount{
    private double interest;
    public CreditCard(){
        super();
        interest = .25;
    }

    public CreditCard(String name, double balance, double interest){
        super(name, balance);
        this.interest = interest;
    }

    public CreditCard(String name, double balance){
        super(name, balance);
        interest = .25;
    }

    public void withdraw(double money){ //charge
        setBalance(getBalance()-money);
        //setBalance and getBalance from BankAccount
    }

    public void deposit(double money){//Payment
        setBalance(getBalance()+money);
    }

    public void addInterest() {
        deposit(getBalance()*interest);
    }

    public String toString() {
        return super.toString() + " CC interest rate of " + (100*interest)+"%";
    }
}
