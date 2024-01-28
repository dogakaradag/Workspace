import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {
        // Name1, Age1
        // Name2, Age2
        // Ayberk ile Doganin yaslari toplami 40
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter name for user 1: ");
//        String name1 = scan.nextLine(); //
//
//        System.out.print("Enter age for user 1: ");
//        int age1 = scan.nextInt(); // "\n"
//        scan.nextLine();
//
//        System.out.print("Enter name for user 2: ");
//        String name2 = scan.nextLine(); // ""
//
//        System.out.print("Enter age for user 2: ");
//        int age2 = scan.nextInt();
//
//        System.out.println("The summation of ages of " + name1 + " and " + name2 + " is " + (age1 + age2));

        /*

        Question: Write a Java program that performs the following tasks:

        1. Reads a String Input: The program should prompt the user to enter their name.
        2. Integer Input: After entering the name, the program should ask the user to enter their age.
        3. Output: The program should then print a message saying, "Hello, [Name], you are [Age] years old!"

         */

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Please enter your name: ");
//        String name = scan.nextLine();
//
//        System.out.print("Please enter your age: ");
//        int age = scan.nextInt();
//
//        System.out.println("Hello, " + name + ", you are " + age + " years old!");

        //                  OPERATORS
        /*
            1. Arithmetic Operators
                    Operator	Operation
                    +	        Addition
                    -	        Subtraction
                    *	        Multiplication
                    /	        Division
                    %	        Modulo Operation (Remainder after division)
        */

//        int a = 5, b = 2;
//        System.out.println("a + b = " + (a+b));
//        System.out.println("a * b = " + (a*b));
//        System.out.println("a - b = " + (a-b));
//        System.out.println("a / b = " + ((float)a/b));
//        System.out.println("a % b = " + (a%b));

        /*
            2. Assignment Operators
                    Operator	    Example	                Equivalent to
                    =	            a = b;	                a = b;
                    +=	            a += b;	                a = a + b;
                    -=	            a -= b;	                a = a - b;
                    *=	            a *= b;	                a = a * b;
                    /=	            a /= b;	                a = a / b;
                    %=	            a %= b;	                a = a % b;
        */

//        int a = 4;
//        int var;
//
//        // assign value using =
//        var = a;
//        System.out.println("var using =: " + var); // 4
//
//        // assign value using =+
//        var += a;
//        System.out.println("var using +=: " + var); // 8
//
//        // assign value using =*
//        var *= a;
//        System.out.println("var using *=: " + var); // 32

        /*
            3. Relational Operators
                Operator	        Description	                    Example
                ==	                Is Equal To	                    3 == 5 returns false
                !=	                Not Equal To	                3 != 5 returns true
                >	                Greater Than	                3 > 5 returns false
                <	                Less Than	                    3 < 5 returns true
                >=	                Greater Than or Equal To	    3 >= 5 returns false
                <=	                Less Than or Equal To	        3 <= 5 returns true
        */
//        // create variables
//        int a = 7, b = 11;
//
//        System.out.println("a is " + a + " and b is " + b);
//        System.out.println(a == b); // f
//        System.out.println(a != b); // t
//        System.out.println(a > b); // f
//        System.out.println(a < b); // t
//        System.out.println(a >= b); // f
//        System.out.println(a <= b); // t

        /*
            4. Logical Operators

                Operator	                Example	Meaning
                && (Logical AND)	        expression1 && expression2	true only if both expression1 and expression2 are true
                || (Logical OR)	            expression1 || expression2	true if either expression1 or expression2 is true
                ! (Logical NOT)	            !expression	true if expression is false and vice versa
        */

//        // && operator
//        System.out.println((5 > 3) && (8 > 5));  // t
//        System.out.println((5 > 3) && (8 < 5));  // f
//
//        // || operator
//        System.out.println((5 < 3) || (8 > 5));  // t
//        System.out.println((5 > 3) || (8 < 5));  // t
//        System.out.println((5 < 3) || (8 < 5));  // f
//
//        // ! operator
//        System.out.println(!(5 == 3));  // t
//        System.out.println(!(5 > 3));  // f
        /*
                        UNARY OPERATORS
                --
                ++
         */

//        int a = 5, b = 5, c = 5, d = 5;
//
//        System.out.println("A++: " + a++); // 5 POST_INCREMENT
//        System.out.println("++B: " + ++b); // 6 PRE_INCREMENT
//        System.out.println("C--: " + c--); // 5 POST_DECREMENT
//        System.out.println("--D: " + --d); // 4 PRE_DECREMENT
//
//        System.out.println("A: " + a);
//        System.out.println("B: " + b);
//        System.out.println("C: " + c);
//        System.out.println("D: " + d);

        // Initialize variables
//        int preIncrement, postIncrement, preDecrement, postDecrement;
//        int number = 5;
//
//        // Pre-increment
//        preIncrement = ++number;
//        System.out.println("What is the output of ++number if number was initially 5? Answer: " + preIncrement); // 6
//
//        // Reset number
//        number = 5;
//
//        // Post-increment
//        postIncrement = number++;
//        System.out.println("What is the output of number++ if number was initially 5? Answer: " + postIncrement); // 5
//
//        // Reset number
//        number = 5;
//
//        // Pre-decrement
//        preDecrement = --number;
//        System.out.println("What is the output of --number if number was initially 5? Answer: " + preDecrement); // 4
//
//        // Reset number
//        number = 5;
//
//        // Post-decrement
//        postDecrement = number--;
//        System.out.println("What is the output of number-- if number was initially 5? Answer: " + postDecrement); // 5


    }
}
