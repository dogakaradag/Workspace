public class InsertionExample {
    public class InsertionSort {
        public static void main(String[] args) {
            for (int i = 1; i < 9; i++) {
                int numOfElements = (int) Math.pow(10, i);
                int[] arr = randomArray(numOfElements);

                long startTime = System.currentTimeMillis();
                insertionSort(arr);
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;

            
                System.out.println(
                        "Insertion Sort - Number of elements: " + numOfElements + " - Time: " + duration + "ms");
            }
        }

        public static int[] randomArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (int) (Math.random() * size);
            }
            return arr;
        }

        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }
}
