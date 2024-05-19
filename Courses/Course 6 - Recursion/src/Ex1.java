public class Ex1 {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(mySum(num));
    }

    // 5^4 ==> 5x5x5x5
//    public static int myPow(int base, int exp) {
//        int result = 1;
//
//        for (int i =1;i<=exp;i++){
//            result *= base;
//        }
//
//        return result;
//    }

//    public static int myPow(int base, int exp) {
//        if (exp == 0){
//            return 1;
//        }
//        return base * myPow(base,exp-1);
//    }
//
    public static int mySum(int num) {
        if (num ==1){
            return 1;
        }
        return num + mySum(num-1);
    }
}
