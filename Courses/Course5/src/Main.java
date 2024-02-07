import java.util.Scanner;

public class Main {

    /*
               1. Parametreli Methodlar

                   a. return yapan methodlar
                   b. return yapmayan methodlar

               2. Parametresiz Methodlar

                   a. return yapan methodlar
                   b. return yapmayan methodlar
        */

    // returnType methodName(params){
    //      Code
    // }

    public static void main(String[] args) {
//        int answer = getFactorial(7); // function call
//        System.out.println("Answer is " + answer);

        int[] arr = {1,55,74,68,94,35};
        int maximum = getMax(arr);
        System.out.println("Max ==> " + maximum);
    }

    // reverseArray

    public static int getMax(int[] array){
        int maximum = array[0];

        for(int i=0; i< array.length;i++){
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }



//    static int getFactorial(int num){
//        int ans = 1;
//
//        for(int i = 1; i <= num; i++)
//            ans *= i;
//
//        return ans;
//    }
}