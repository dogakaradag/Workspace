package hw2;

import java.util.Arrays;
//Write a method named mergeArrays that takes two arrays as input and sorts them in one array
public class hwMethods3 {
    public static void main(String[] args) {
        int max = getMax(5,3);
        System.out.println("Max number: " +max);

    }
    public static int getMax(int num1, int num2){
        if (num1 == num2){
            System.out.println("the numbers are equal");
            return num1;
        }
        if (num1 < num2){
            return num2;
        }
        else{
            return num1;
        }

    }

}
