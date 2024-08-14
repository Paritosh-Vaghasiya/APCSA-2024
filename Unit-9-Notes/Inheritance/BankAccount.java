package Inheritance;
public class BankAccount {
    private String name;
    private double balance;
    public String nothing;

    public BankAccount(){
        name="";
        balance = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        nothing = "everything";
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double money){
        balance += money;
    }

    public void withdraw(double money){
        if (money > balance){
            System.out.println("Not enough money");
        } else {
            balance -= money;
        }
    }

    public String toString() {
        return name + " has this much money $" + balance;
    }
}
