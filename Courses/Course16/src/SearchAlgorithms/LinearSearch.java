package SearchAlgorithms;
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        
        // Linear Search
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 55;

        int ans = linearSearch(arr, target);
        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}
