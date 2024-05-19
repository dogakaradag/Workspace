package fibonacci;

public class HW {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " ==> " + findFibonacci(i));
        }
    }

    // 111111111111111111111111111111111111 ==> 2.147M
    public static long findIterativeFibonacci(int num){
        long firstTerm = 1;
        long secondTerm = 1;
        long nextTerm = 2;
        for (int i=0; i<num-2; i++){
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return nextTerm;
    }

    public static int findFibonacci(int num){
        if (num <=1 ){
            return num;
        }
        return findFibonacci(num-1) + findFibonacci(num-2);
    }
}

