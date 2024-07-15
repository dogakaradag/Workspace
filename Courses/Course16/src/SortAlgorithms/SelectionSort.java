package SortAlgorithms;

/**
 * SelectionSort
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 1, 3, 7, 4 };
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIdx = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <= arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}