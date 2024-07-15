package Q1;

/**
 * Code
 */

// Implement both iterative and recursive versions of a function that finds the sum of all numbers from 1 up to n.

public class Code {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Sum of numbers from 1 to " + number + " is " + findSum(number));
        System.out.println("Sum of numbers from 1 to " + number + " is " + recursiveFindSum(number));
    }

    public static int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recursiveFindSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + recursiveFindSum(number - 1);
    }
}