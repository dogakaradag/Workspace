public class Ex4 {
    // Implement a Java function `boolean isSorted(int arr[])` that checks if
    // an array `arr` is sorted in ascending order. Return 1 if sorted, else 0.
    public static void main(String[] args) {
        int[] array = {1,2,-9,4,5,6,7,8,9,10};

        boolean ans = isSorted(array);
        if(ans){
            System.out.println("Array is sorted!");
        }
        else{
            System.out.println("Array is not sorted!");
        }

    }
    public static boolean isSorted(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}
