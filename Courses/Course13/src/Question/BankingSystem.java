package Question;

public class BankingSystem {

    public static void main(String[] args) {
        Account myAccount = new Account(1000);

        try {
            myAccount.deposit(500);
        } catch (InvalidFundException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAccount.withdraw(200);
        } catch (InsufficientFundsException | InvalidFundException e) {
            System.out.println(e.getMessage());
        }

        try {
            myAccount.deposit(-500);
        } catch (InvalidFundException e) {
            System.out.println(e.getMessage());
        }
        try {
            myAccount.withdraw(5000);
        } catch (InsufficientFundsException | InvalidFundException e) {
            System.out.println(e.getMessage());
        }
    }
}