public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public void withdraw(double amount){
        if (amount > 0){
            if (balance >= amount){
                balance-=amount;
                System.out.println(amount + " has been withdrawn from your account. Your current balance is: " + balance);
            }
            else{
                System.out.println("Insufficient funds for this amount.");
            }
        }
        else{
            System.out.println("This amount cannot be withdrawn.");
        }
    }

    public void deposit(double amount){
        if (amount>0){
            balance +=amount;
            System.out.println(amount + "has been deposited. New balance stands at: " + balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
