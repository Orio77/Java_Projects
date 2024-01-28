package OOP.ex7;

abstract class AbstractAccount {
    public int accountID;
    private int customerID;
    private double balance = 0;
    public String transaction_history;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void getTransactionHistory() {
        System.out.println(transaction_history);
    }
}
