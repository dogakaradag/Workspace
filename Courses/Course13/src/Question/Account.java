package Question;

public class Account {

    private double balance;
    private String accountNumber;

    public Account(double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) throws InvalidFundException {
        if (amount <= 0) {
            throw new InvalidFundException("Invalid deposit amount" + amount);
        }
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        
        
    }


    public void withdraw(double amount) throws InsufficientFundsException, InvalidFundException {
        if (amount <= 0) {
            throw new InvalidFundException("Invalid withdrawal amount: " + amount);
        }
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient amount. Balance is: " + balance );
        }
        balance -= amount;
        System.out.println("Withdraw successful. New balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
