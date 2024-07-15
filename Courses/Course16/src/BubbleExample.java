public class BubbleExample {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            int numOfElements = (int) Math.pow(10, i);
            int[] arr = randomArray(numOfElements);

            
            long startTime = System.currentTimeMillis();
            bubbleSort(arr);
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

        
            System.out.println("Bubble Sort - Number of elements: " + numOfElements + " - Time: " + duration + "ms");
        }
    }


    public static int[] randomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
    
