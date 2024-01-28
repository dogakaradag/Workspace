import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        //6. Find GCD of a number.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        int min;

        if (number1 < number2){
            min = number1;
        }
        else {
            min = number2;
        }

        for (int i=min; i>=1; --i){
            if ((number1 % i == 0)&&(number2 % i == 0)){
                System.out.println("The GCD of two numbers is: " + i);
                break;
            }
        }
    }
}