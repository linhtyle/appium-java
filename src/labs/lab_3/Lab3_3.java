package labs.lab_3;

import java.util.Arrays;

public class Lab3_3 {
    /*
    Sort an integer array from min to max
    Input: {12, 34, 1, 16, 28}
    Expected output: {1, 12, 16, 28, 34}
     */
    public static void main(String[] args) {
        int[] myIntArr = {12, 34, 1, 16, 28};
        sortArray(myIntArr);
        System.out.println("Array after sorted:" + Arrays.toString(myIntArr));
    }

    public static void sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}