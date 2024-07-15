import java.util.HashMap;
import java.util.Map;

public class MemoizationExample {
    public static long fibonacci(int n, Map<Integer, Long> memo) {

        if (memo.containsKey(n)) {

            return memo.get(n);
        }
        if (n <= 1) {
            return n;
        }

        long fib = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        memo.put(n, fib);

        return fib;
    }
    
    public static void main(String[] args) {
        Map<Integer, Long> memo = new HashMap<>();
        int n = 10;
        System.out.println("Fibonacci " + n + " = " + fibonacci(n, memo));
    }
}