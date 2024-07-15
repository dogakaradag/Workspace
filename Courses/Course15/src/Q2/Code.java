package Q2;

/**
 * Code
 */

// Implement both recursive and iterative versions of the function that computes the base^exponent. These functions should have the following signature:
// public static int power(int base, int exponent)
// public static int powerRecursive(int base, int exponent)

public class Code {

    public static void main(String[] args) {
        System.out.println(power(2, 3));
        System.out.println(powerRecursive(2, 3));
    }

    public static int power(int base, int exponent) {
        int ans = 1;
        for (int i = 1; i <= exponent; ++i) {
            ans = ans * base;
        }
        return ans;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * powerRecursive(base, exponent - 1);
    }
}