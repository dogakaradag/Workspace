public class Ex2 {
    // Develop a Java function `int countOccurrences(int[] arr, int x)`
    // that counts the number of times `x` appears in the array `arr`.

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,2,3,5,2,2,9,7};
        int search = 2;
        int answer = getTheCountOfX(array,search);

        // Number 2 occurs 6 times in the array.
        System.out.println("Number " + search + " occurs " + answer + " times in the array.");

    }

    public static int getTheCountOfX(int[] array, int x) {
        int countX = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                countX++;
            }
        }
        return countX;
    }

}
