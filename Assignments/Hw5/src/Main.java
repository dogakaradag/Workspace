import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 5. Count number of digits of an integer.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int digits = 0;
        while (number != 0) {
            number/=10;
            digits++;
        }
        System.out.print("There are "+ digits + " digits");
    }
}