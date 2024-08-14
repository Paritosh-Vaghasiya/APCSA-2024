import java.sql.SQLOutput;

public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount bill = new BankAccount();// Uses the default constructor
        System.out.println(bill);
        BankAccount jill = new BankAccount(99999.01, "jill");
        System.out.println(jill);
        bill.setName("bill");
        bill.setBalance(561);
        System.out.println(bill);
        bill.deposit(123);
        System.out.println(bill);
        jill.withdraw(5623);
        System.out.println(jill);
        bill.withdraw(9999999);
        System.out.println(bill);
        bill.interest();
        System.out.println(bill);

    }
}
