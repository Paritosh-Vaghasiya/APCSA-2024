package Inheritance;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        BankAccount bob = new BankAccount("bob", 9999);
        accounts.add(bob);
        bob.deposit(101.01);
        System.out.println(bob);
        bob.withdraw(555.07);
        System.out.println(bob);
        bob.withdraw(999999999);

        MoneyMarket sue = new MoneyMarket("sue", 8765, .07);
        accounts.add(sue);
        System.out.println(sue);
        sue.deposit(1234.03);
        System.out.println(sue);
        sue.addInterest();
        System.out.println(sue);
        sue.withdraw(555.07);
        System.out.println(sue);

        CreditCard steve = new CreditCard("steve", 123.04);
        accounts.add(steve);
        System.out.println(steve);
        steve.addInterest();
        System.out.println(steve);
        steve.withdraw(5000);
        steve.withdraw(23456);
        System.out.println(steve);
        steve.addInterest();
        System.out.println(steve);
        steve.deposit(30000);
        System.out.println(steve);
        System.out.println(sue.getNothing());
        System.out.println(sue.getSuperNothing());
        
        CD blah = new CD("siegie", 642345, .09, 9);
        accounts.add(blah);
        System.out.println(blah);

        //AP QUESTION
        BankAccount cubs = new MoneyMarket("Cubs", 2017, .01);
        accounts.add(cubs);
        System.out.println(cubs);
        BankAccount cubs1 = new BankAccount("Cubs", 2017);
        System.out.println(cubs1);
        /* Which of the following lines of code will create a syntax error?

        A) BankAccount money = new BankAccount();
        B) MoneyMarket saving = new MoneyMarket();
        C) MoneyMarket save = new CD();
        D) CreditCard spend = new BankAccount(); <- this is the bad one

         */

        for (BankAccount x : accounts){
            System.out.println(x);
        }
    }
}
