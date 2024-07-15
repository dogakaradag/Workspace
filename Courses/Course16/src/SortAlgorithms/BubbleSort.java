package SortAlgorithms;

/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        bubbleSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr)); 
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        do{
            swapped = false;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}