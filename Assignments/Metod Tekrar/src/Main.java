import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Before: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("After: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int j = 0;
        int i = array.length - 1;
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
        while (i > j) {
            i--;
            j++;
        }
    }
}