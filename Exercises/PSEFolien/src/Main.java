public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int result = main.getSumOfSquares(5);
        System.out.println("The sum of squares is: " + result);
    }

    public int getSumOfSquares(final int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i * i;
        }
        return result;
    }
}

