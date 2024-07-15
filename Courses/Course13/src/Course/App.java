package Course;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);

        // int num1 = 0, num2 = 0;

        // try {
        // System.out.print("Enter first number: ");
        // num1 = sc.nextInt();

        // System.out.print("Enter second number: ");
        // num2 = sc.nextInt();
        // } catch (InputMismatchException e) {
        // System.out.println("Please enter a valid number.");
        // }

        // try {
        // System.out.println("Division of two numbers: " + (num1 / num2));
        // } catch (ArithmeticException e) {
        // System.out.println("Division by zero is not allowed.");
        // }

        // System.out.println("Program is completed.");

        // sc.close();

        // try {
        // int[] arr = new int[5];
        // arr[4] = 10;
        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("Array index is out of bound.");
        // } catch (Exception e) {
        // System.out.println("Some error occurred.");
        // }
        // finally {
        // System.out.println("Finally block is always executed.");
        // }

        /*
         * Throwable
         * |
         * ---Exception
         * | |
         * | ---IOException
         * | |
         * | ---SQLException
         * | |
         * | ---ArithmeticException
         * | |
         * | ---ArrayIndexOutOfBoundsException
         * | |
         * | ---InputMismatchException
         * | |
         * ---NullPointerException
         * |
         * ---NumberFormatException
         * |
         * ---IllegalArgumentException
         * |
         * ---IllegalStateException
         * |
         * ---FileNotFoundException
         * |
         * ---NoSuchElementException
         * |
         * ---ConcurrentModificationException
         * |
         * 
         * ---Error
         * | |
         * | ---StackOverflowError
         * | |
         * | ---OutOfMemoryError
         * |
         */

        /*
         * if (magazine.isEmpty()) {
         * throw new EmptyMagazineException("Magazine is empty.");
         * }
         */

        // try {
        // throw new EmptyMagazineException("Magazine is empty.");
        // } catch (EmptyMagazineException e) {
        // System.out.println(e.getMessage());
        // }
    }
}
