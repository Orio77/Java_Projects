package OOP.ex7;

public interface BankInterface {

    public void addAccount(Account account);

    public void removeAccount(String accountID);

    public void deposit(String accountID, double amount);

    public void withdraw(String accountID, double amount);

    public void transfer(String fromAccountID, String toAccountID, double amount);

    
}
