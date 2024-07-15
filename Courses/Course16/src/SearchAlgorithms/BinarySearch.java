package SearchAlgorithms;
public class BinarySearch {
    /*
            100 - 0
            50 - 0
            25 - 0
            12 - 0
            6 - 0
            3 - 0
            1 - 0
    */

    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }

        int target = 1000;
        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }            
        }

        return -1;
    }
}
