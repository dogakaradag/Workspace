package hw2;

public class hwMethods5 {
    public static void main(String[] args) {
        int ans = getFactorial(3);
        System.out.println(ans + " is the factorial." );

    }
    public static int getFactorial (int num){
        int factorial =1;
        for (int i =1; i<=num; ++i){
            factorial *= i;
        }
        return factorial;
    }
}
