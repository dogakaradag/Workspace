import java.util.Arrays;

public class Ex3 {
    // Write a Java function `void sortArray(int[] arr)`
    // that sorts an array `arr` in ascending order.
    public static void main(String[] args) {
        int [] array = {6,3,1,9,10,2,0,7,5,4};
        System.out.println("Before: " + Arrays.toString(array));
        sortArray(array);
        System.out.println("After: " + Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i =0; i< array.length; ++i){
            for(int j =0; j < array.length-1 ; ++j){
                if (array[j] > array[j+1]){
                    int b = array[j];
                    array[j] = array[j+1];
                    array[j+1]=b;

                }
            }
        }

    }
}
