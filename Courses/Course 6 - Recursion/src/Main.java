public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
//    public static int getFactorial (int num){
//        int factorial = 1;
//
//        for (int i =1;i<=num;++i){
//           factorial *= i;
//        }
//        return factorial;
//    }
    public static int getFactorial(int num){
        if (num == 1){
            return 1;
        }
        return num * getFactorial(num-1);
    }
}