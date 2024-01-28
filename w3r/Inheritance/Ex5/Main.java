package Inheritance.Ex5;

public class Main {
    public int balance;
    public static void main(String[] args) {

        BankAccount myAccount1 = new BankAccount();
        SavingsAccount mySavingsAccount1 = new SavingsAccount();

        myAccount1.deposit(10_000);
        mySavingsAccount1.deposit(10_000);

        System.out.println(mySavingsAccount1.withdraw());
    }
}




/*5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred. */