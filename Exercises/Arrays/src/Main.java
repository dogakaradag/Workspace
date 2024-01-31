import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        ARRAYS

//        // dataType[] varName = new dataType[numOfElements];
//        String[] cars = new String[3];
//        // ["CAMARO", "MERCEDES", "BMW"]
//        //    0            1        2
//
//        cars[0] = "CAMARO";
//        cars[1] = "MERCEDES";
//        cars[2] = "BMW";
//
//        for (String element : cars) { // For Each Loop
//            System.out.println(element);
//        }

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

        // ----------------------------------------------------------

        // Let user enter # of elements for an array of doubles.
        // Make user fill this array.
        // Print all array.

        Scanner scan = new Scanner(System.in);

//        System.out.print("How many elements do you want in this Array?: ");
//        int numberOfElements = scan.nextInt();
//
//        double[] elements = new double[numberOfElements];
//
//        for (int i = 0; i < numberOfElements; i++){
//            System.out.print("Enter number-" + (i+1) + ": ");
//            elements[i] = scan.nextDouble();
//        }
//
//        System.out.print("\nARRAY ==> ");
//
//        for (int i=0; i < elements.length; i++){
//            System.out.print(elements[i] + "  ");
//        }

//        for (double element : elements) {
//            System.out.print(element + " ");
//        }

        // ----------------------------------------------------

        // Let user N sized array of integers and make him to fill that array.
        // Print all the numbers stored in this array which can be divisible by 3 but not 5.
//        System.out.print("How many elements do you want in this array: ");
//        int numElements = scan.nextInt();
//        int[] elements = new int[numElements];
//
//        for (int i=0; i<numElements; i++){
//            System.out.print("Enter a number: ");
//            elements[i] = scan.nextInt();
//        }
//
//        System.out.print("\nNumbers that can divisible by 3 bot not 5 ==> ");
//
//        for (int elem : elements){
//            if ((elem % 3 == 0) && (elem % 5 != 0)){
//                System.out.print(elem + " ");
//            }
//        }

        // Make user fill an array of integers that has 5 elements in it. Then find out the max element in that array.

//        int [] elements = new int[5];
//
//        for (int i = 0; i<5; i++) {
//            System.out.print("Enter a number: ");
//            elements[i] = scan.nextInt();
//        }
//        int max = elements[0];
//        int min = elements[0];
//        int sum = 0;
//
//
//        for (int element : elements) {
//            if (element > max) {
//                max = element;
//            }
//            if (element < min){
//                min = element;
//            }
//            sum+=element;
//        }
//
//        System.out.println("MAX ==> " + max);
//        System.out.println("MIN ==> " + min);
//        System.out.println("AVG ==> " + sum/5.0);

       //        2D ARRAYS

        String[][] cars = new String[2][3];
        cars[0][0] = "CAMARO";
        cars[0][1] = "MERCEDES";
        cars[0][2] = "TESLA";
        cars[1][0] = "MUSTANG";
        cars[1][1] = "PORSCHE";
        cars[1][2] = "LAMBORGHINI";

        for (int i = 0; i <= cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
        }
    }
}