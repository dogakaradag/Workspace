import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  7. Find LCM of a number.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        int max;

        if (number1 > number2){
            max = number1;
        }
        else{
            max = number2;
        }

        int testNum = max;

        while (true){
            if ((testNum % number1 == 0)&&(testNum % number2 ==0)){
                System.out.println("LCM is: " + testNum);
                break;
            }
            testNum++;
        }
    }
}