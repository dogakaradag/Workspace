//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankApp myAccount = new BankApp("12345", 1000);
        System.out.println("Your balance is: " + myAccount.getBalance());
        myAccount.withdraw(200);
        myAccount.deposit(500);
        myAccount.withdraw(5000);
        System.out.println("Your balance is now "+myAccount.getBalance());
    }
}