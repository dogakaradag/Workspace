import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 3. Check if a number entered by user is an armstrong number or not.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an armstrong number or not: ");
        int number = scan.nextInt();

        int digitCount = 0;
        int copyNum = number;
        while (copyNum != 0){
            copyNum/=10;
            digitCount++;
        }

        // 123

        copyNum = number;
        int armstrong = 0;

        // 123
        while (copyNum != 0){
            int lastDigit = copyNum % 10;
            int power = 1;

            for (int i = 1; i <=digitCount; i++){
                power *= lastDigit;
            }

            armstrong += power;
            copyNum /= 10;
        }

        if (armstrong == number){
            System.out.println("This is an armstrong number. ");
        }
        else {
            System.out.println("This is not an armstrong number. ");
        }
    }
}