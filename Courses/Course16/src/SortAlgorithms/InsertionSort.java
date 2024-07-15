package SortAlgorithms;

/**
 * InsertionSort
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        // 32 30 59 26 41 58

        /*
                1. Create a for loop starting from 1 to arr.length
                2. Assign arr[i] to current
                3. Create a var j which is i-1
                4. Create a while loop that works when j is bigger or equal to 0 and that element at index j is bigger than current
                    4.1. Assign the element stored at index j to the element stored at index j+1
                    4.2. Decrement j by 1   
                5. Assign the current element to the element stored at ind j+1    
        */

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}