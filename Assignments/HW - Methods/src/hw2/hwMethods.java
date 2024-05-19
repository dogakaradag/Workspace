package hw2;

public class hwMethods {
    public static void main(String[] args) {
        double money = 10000;
        double rateOfInterest = 5;
        int timeInYears = 5;
        double totalAmount = calculateInterest(money, rateOfInterest, timeInYears);
        System.out.println("Toplam miktar: " + totalAmount);
    }

    public static double calculateInterest(double principal, double rate, int time){
        double amount = principal * Math.pow(1 + rate / 100, time);
        return amount;
    }
}
