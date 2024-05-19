//public class Ex7 {
    /*

        Check Prime Number

        Write a Java method named isPrime that takes an integer as a parameter and returns true if the number
        is a prime number, and false otherwise. Use this method to print prime numbers within a range of numbers.

     */
    public static void main(String[] args) {
        boolean ans = isPrime(1);
        if(ans) {
            System.out.println("The number is prime. ");
        }
        else {
            System.out.println("The number is not prime. ");
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }