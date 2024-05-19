package hw2;

import java.util.Arrays;

// a method that sorts the array in ascending order
public class hwMethods9 {
    public static void main(String[] args) {
        int [] array = {1,5,7,3,0,89,6,4,46,7,55,9797};
        sortArray(array);

        for (int num : array){
            System.out.print(num + " ");
        }
    }
    public static void sortArray (int[] array){
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
