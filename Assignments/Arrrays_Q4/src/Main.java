public class Main {
    public static void main(String[] args) {
        // i
        // 1 2 3 4 5 6 7 8 9
        //                 j
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.print("Before:");
        for (int k=0; k<arr.length;k++){
            System.out.print(arr[k]  + " ");
        }

        //
        int i = 0;
        int j = (arr.length)-1;

        while (i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]= temp;

            ++i;
            --j;
        }
        //

        System.out.print("\n\nAfter: ");
        for (int value : arr) {
            System.out.print(value  + " " );
        }

    }
}