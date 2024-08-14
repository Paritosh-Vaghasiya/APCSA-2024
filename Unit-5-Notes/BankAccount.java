public class BankAccount {
    private double balance;// This is an object var (Belong to the customer)
    private String name;// This is an object var (Belong to the customer)
    private static int AccountNumber = 1000;// This is a class var (Belongs to the Bank class) Capitalize each word
    private static final double INTERESTRATE = .03;// This would be a class constant (Belongs to the Bank class) Capitalize the whole word
    private int accountNum;
    public BankAccount(){
        balance = 0.0;
        name = " ";
        accountNum = ++AccountNumber;
    }

    public BankAccount(double balance, String name){
        this.balance = balance;
        this.name = name;
        accountNum = ++AccountNumber;
    }

    //Accessor Methods
    public double getBalance(){return balance;}
    public String getName(){return name;}

    //Mutator Methods
    public void setBalance(double balance){this.balance = balance;}
    public void setName(String name){this.name = name;}

    //ToString Method
    public String toString() {
        return name + " has a balance of $" + balance + " and account number is: " + accountNum;
    }

    public void deposit(double money){
        if (money >= 10000){
            System.out.println("Money is on hold for 5 days");
            balance += money;
        } else {
            balance += money;
        }

    }
    public void withdraw(double money){
        if (balance >= money)
            balance-=money;
        else
            System.out.println("Insufficient funds");
    }

    public void interest(){
        deposit(balance*INTERESTRATE);
    }
}
