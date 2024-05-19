package hw2;

public class hwMethods6 {
    public static void main(String[] args) {
        int num = 9;
        if (isPrime(num)) {
            System.out.println("This is a prime number. ");
        } else{
            System.out.println("This is not a prime number. ");
        }

    }
    public static boolean isPrime (int num){
        if (num <=1){
            return false;
        }
        for (int i =2; i<= num/2; ++i){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }
}
