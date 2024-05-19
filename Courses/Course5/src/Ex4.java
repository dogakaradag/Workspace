public class Ex4 {
    // Implement a Java function `boolean isSorted(int arr[])` that checks if
    // an array `arr` is sorted in ascending order. Return 1 if sorted, else 0.
    public static void main(String[] args) {
        int[] array1 = {1,2,-9,4,5,6,7,8,9,10};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        int[] array3 = {10,9,8,7,6,5,4,3,2,1};
        int[] array4 = {10,9,8,7,5,6,4,3,2,1};
        int[] array5 = {1,2,3,4,5,7,6,8,9,10};


        boolean ans = isSorted(array5);
        if(ans){
            System.out.println("Array is sorted!");
        }
        else{
            System.out.println("Array is not sorted!");
        }
    }
    public static boolean isSorted(int[] array){
        boolean descending = true;
        boolean ascending = true;

        for (int i = 0; i < array.length-1; i++){
            if (array[i] < array[i+1]){
                descending = false;
            }
            if (array[i] > array[i+1]){
                ascending = false;
            }
        }



    }
}

