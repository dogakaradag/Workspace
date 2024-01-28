import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4. Check whether a number is palindrome or not.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it's palindrome");

        int number = scan.nextInt();
        int originalNumber = number; //BUNU NEDEN YAPTIGIMIZI ANLAMADIM
        int reversedNum = 0;

        while (number !=0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10+ digit;
            number /= 10;
        }

        if (reversedNum == originalNumber) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}