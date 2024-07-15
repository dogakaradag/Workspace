package Q3;

/**
 * Code
 */

// Implement both recursive and iterative versions of the following function:
// int fibo(int n)
// which returns the nth Fibonacci number. The Fibonacci sequence is defined as follows:
// fibo(0) = 0
// fibo(1) = 1
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

public class Code {
    public static void main(String[] args) {
        // int n = 8;
        // System.out.println("Iterative: " + findFibo(n));
        // System.out.println("Recursive: " + findFiboRecursive(n));

        // for (int i = 0; i < 100; i++) {
        //     System.out.println("Number - " + i + " : " + findFibo(i));
        // }

        for (int i = 0; i < 100; i++) {
            System.out.println("Number - " + i + " : " + findFiboRecursive(i));
        }
    }

    // f(50) ==> f(49) + f(48)

    // Recursive
    public static int findFiboRecursive(int n) {
        if (n <= 1) {
            return n;
        } 
        return findFiboRecursive(n - 1) + findFiboRecursive(n - 2);  
    }

    public static long findFibo(int n) {
        long firstTerm = 0;
        long secondTerm = 1;
        long nextTerm = 0;
        
        for (int i = 2; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return nextTerm;
    }
}