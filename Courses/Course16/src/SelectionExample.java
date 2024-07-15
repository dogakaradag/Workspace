public class SelectionExample {
    public class SelectionSort {

        public static void main(String[] args) {
            for (int i = 1; i < 9; i++) {
                int numOfElements = (int) Math.pow(10, i);
                int[] arr = randomArray(numOfElements);

                
                long startTime = System.currentTimeMillis();
                selectionSort(arr);
                long endTime = System.currentTimeMillis();
                long duration = endTime - startTime;

               
                System.out.println(
                        "Selection Sort - Number of elements: " + numOfElements + " - Time: " + duration + "ms");
            }
        }

       
        public static int[] randomArray(int size) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = (int) (Math.random() * size);
            }
            return arr;
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
}
