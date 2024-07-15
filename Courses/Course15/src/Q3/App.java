package Q3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        System.out.println("The factorial of " + number + " is " + factorial(number));
        System.out.println("The factorial of " + number + " is " + factorialRecursive(number));
    }

    public static int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}