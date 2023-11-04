package Inheritance.Ex5;

public class SavingsAccount extends BankAccount{

    @Override
    public int withdraw() {
        if (balance < 100) {
            System.out.println("You can not withdraw money now!");
            return balance;
        }
        else {
            balance = 0;
            return balance;
        }
    }
    
}
