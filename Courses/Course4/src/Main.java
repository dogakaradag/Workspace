import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Let user enter a number and then find out the summation of all numbers between 0-N
//
//        Scanner scan = new Scanner(System.in);
//        int sum = 0;
//
//        System.out.print("Enter a number: ");
//        int number = scan.nextInt();
//
//        for (int i=0;i<=number;i++) {
//            sum+=i;
//        }
//
//        System.out.println("Sum ==> " + sum);

        // -------------------------------------------------------------------

        // Let user enter a number and then find out the factorial of that number.

//        Scanner scan = new Scanner(System.in);
//        int answer = 1;
//
//        System.out.print("Enter a number: ");
//        int number = scan.nextInt();
//
//        for (int i=1;i<=number;i++) {
//            answer*=i;
//        }
//        System.out.println(answer);

        // Let user enter a number and then find out how many prime numbers are there between 0-N
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a number N: ");
//        int N = scan.nextInt();
//
//        int numPrimes = 0;
//
//        for (int num = 0; num <= N; num++) {
//            boolean isPrime = true;
//
//            if (num <=1) {
//                isPrime = false;
//            }
//
//            for (int i = 2; i <= num/2; i++){
//                if (num % i == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime == true) {
//                System.out.println(num + " ==> PRIME");
//                numPrimes++;
//            }
//            else{
//                System.out.println(num + " ==> NOT PRIME");
//            }
//        }
//
//        System.out.println("There is " + numPrimes + " prime numbers between the range 0-" + N);

        // Let user enter `base` and `exponent` and then find out what is the base^exponent?
//        Scanner scan = new Scanner(System.in);
//
//        int answer = 1;
//        System.out.print("Enter a base: ");
//        int base = scan.nextInt();
//
//        System.out.print("Enter an exponent: ");
//        int exponent = scan.nextInt();
//
//        for (int i = 1; i <= exponent; i++) {
//            answer *= base;
//        }
//
//        System.out.println("Answer is ==> " + answer);

        /*

         *
         * *
         * * *
         * * * *
         * * * * *


         */

//        for (int row = 1; row <=5; row++) {
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
//        for (int row = 1; row <=5; row++) {
//            for (int col = 1; col<=row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }


        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
//        for (int row = 5; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        /*

                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1

         */
//        for (int row = 5; row >= 1; row--) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }


        /*

                A
                B B
                C C C
                D D D D
                E E E E E

                65
                66 66
                67 67 67
                68 68 68 68
                69 69 69 69 69


                ASCII Table
         */

//        System.out.println((int)'A');
//        System.out.println((char)65);
//        System.out.println((char)66);
//        System.out.println((char)67);
//        System.out.println((char)68);

        // Let user enter a number and then find out how many prime numbers are there between 0-N
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number N : ");
//        int N = scan.nextInt();
//        int numPrimes = 0;
//
//        for (int num =0; num<=N; num++) {
//            boolean isPrime = true;
//            if (num <= 1) {
//                isPrime = false;
//            }
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime == true) {
//                System.out.println(num + " = prime");
//                numPrimes++;
//            } else {
//                System.out.println(num + " = not prime");
//            }
//        }
//            System.out.println("There are " + numPrimes + " prime numbers." );

        //HOMEWORK
//        1. Let user enter a number and then generate another integer ‘reversedNum’ which holds the reversed version of the number entered by user.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//       int number = scan.nextInt();
//       int reversedNum = 0;
//       while (number != 0){
//          int digit = number % 10;
//          reversedNum = reversedNum * 10 + digit;
//          number /= 10;
//       }
//        System.out.println(reversedNum);

//        2. ⁠Let user enter a number and then print the factors of that number.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scan.nextInt();
//        for (int i = 1; i<= number ; i++){
//            if (number % i == 0){
//            System.out.println(i);
//        }


//        3. ⁠Check if a number entered by user is an armstrong number or not.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number to check if it's an armstrong number or not: ");
//        int number = scan.nextInt();


//        4. ⁠Check whether a number is palindrome or not.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number to check if it's palindrome");
//        int number = scan.nextInt();
//        int originalNumber = number; //BUNU NEDEN YAPTIGIMIZI ANLAMADIM
//        int reversedNum= 0;
//        boolean isPalindrome = true;
//        while (number !=0) {
//            int digit = number % 10;
//            reversedNum = reversedNum * 10+ digit;
//            number /= 10;
//        }
//        if (number<=9) {
//            isPalindrome = false;
//            System.out.println("not palindrome");
//        }
//            else if (reversedNum == originalNumber) {
//                isPalindrome = true;
//                System.out.println("palindrome");
//            }
//                else {
//                    System.out.println("not palindrome");
//                }


//        5. Count number of digits of an integer.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter a number");
//        int number = scan.nextInt();
//        int digits = 0;
//        while (number != 0) {
//            number/=10;
//            digits++;
//        }
//        System.out.print("There are "+ digits + " digits");

//        6. Find GCD of a number.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        int gcd = gcd(number1, number2);
        System.out.println("the gcd of " + number1 + " and " + number2 + " = " + gcd);
    }

    private static int gcd(int a, int b) {
        if(b ==0) {
            return a;
        } else {
            return gcd(b, a %b);
        }
    }


    //  7. Find LCM of a number.
}