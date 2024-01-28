package Inheritance.Ex5;

public class BankAccount {
    public static int balance = 0;

    public void deposit(int depositMoney) {
        balance = balance + depositMoney;
        System.out.println("You have deoposit: " + depositMoney + "$");
    }

    public int withdraw() {
        balance = 0;
        return balance;
    }




}
