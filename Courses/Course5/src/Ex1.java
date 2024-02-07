import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("After: " + Arrays.toString(array));
    }
    public static void reverseArray(int[] array){
        int i = 0;
        int j = array.length-1;

        while (i < j){
            int x = array[i];
            array[i] = array[j];
            array[j] = x;

            j--;
            i++;
        }
    }
}
