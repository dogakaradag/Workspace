public class Ex5 {
    /*

    Method for Factorial Calculation

    Create a Java method named calculateFactorial to calculate the factorial
    of a given number. The method should take an integer as a parameter and return the factorial
    of that number. Ensure to test the method with various cases.

    */
//    public static void main(String[] args) {
//        int num = 7;
//        int ans = returnFactorial(num);
//        System.out.println("The factorial of the number " + num + " is " + ans);
//
//    }
//    public static int returnFactorial(int num){
//        int factorial = 1;
//        for (int i = 1; i<=num ; i++) {
//            factorial *= i;
//        }
//        return factorial;

    public static void main(String[] args) {
        int num =7;
        int ans = calculateFactorial(num);
        System.out.println(ans);
    }
    public static int calculateFactorial (int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
