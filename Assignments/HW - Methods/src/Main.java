
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = CalcSum();
        System.out.println("Sum is: " +sum);

    }
    public static int CalcSum() {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter num1: ");
        num1 = scan.nextInt();

        System.out.println("Enter num2: ");
        num2 = scan.nextInt();

        int sum = num1+num2;
        return sum;


    }
}