package Q1;

public class Main {
    public static void main(String[] args) {
        // Creating Q1.BankAccount objects and testing methods
        BankAccount account1 = new BankAccount("John Doe", "Doga");
        System.out.println("Account 1:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Balance: $" + account1.getBalance());
        System.out.println();

        account1.deposit(200.00);
        System.out.println();

        account1.withdraw(300.00);
        System.out.println();

        BankAccount account2 = new BankAccount("Jane Smith", "Ayberk");
        System.out.println("Account 2:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Balance: $" + account2.getBalance());
        System.out.println();

        account2.deposit(500.00);
        System.out.println();

        account2.withdraw(200.00);
    }
}