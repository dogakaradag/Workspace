import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        1. Let user enter a number and then generate another integer ‘reversedNum’ which holds the reversed version of the number entered by user.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int reversedNum = 0;
        while (number != 0){
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }
        System.out.println(reversedNum);
    }
}