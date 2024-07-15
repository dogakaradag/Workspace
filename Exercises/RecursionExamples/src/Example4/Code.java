package Example4;

import java.util.HashMap;
import java.util.Map;

public class Code {
    public static void main(String[] args) {
        int n = 5; 
        Map<Integer, Integer> memo = new HashMap<>();
        int ways = countWays(n, memo);
        System.out.println("Number of ways to reach the " + n + "th stair: " + ways);
    }

    public static int countWays(int n, Map<Integer, Integer> memo) {
        // Memoızatıon (fıbonaccı)
        if (n == 0) {
            return 1; 
        }
        if (n == 1) {
            return 1; 
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ways = countWays(n - 1, memo) + countWays(n - 2, memo);
        memo.put(n, ways);

        return ways;
    }
}
