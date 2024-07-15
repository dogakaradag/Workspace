public class BankApp {

    private String accountNumber;
    private double balance;

    public BankApp(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdraw (double amount){
        if (amount >0){
            balance-=amount;
            System.out.println(amount + " = withdrawn. New balance is: " + balance);
        }else if (amount<=0)
        {
            System.out.println("Withdraw amount must be positive. ");
        }
    }
    public void deposit (double amount){
        if (amount >0){
            balance += amount;
            System.out.println("Deposit successful. New balance is " + balance);
        }
    }

    public double getBalance(){
        return balance;
    }
}
