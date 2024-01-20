package labs.lab_3;

import java.util.Scanner;

public class Lab3_1 {
    /*
    Count how many odd, even number(s) in an integer array
    int[] intArr = {1, 2, 3, 4, 5};
    Even numders: 2
    Odd numbers: 3
     */
    public static void main(String[] args) {
        int[] myIntArr = new int[]{1, 2, 3, 4, 5};
        for (int myIndex = 0; myIndex < myIntArr.length; myIndex++) {
            if (myIntArr[myIndex] % 2 == 0) {
                System.out.println("Index " + myIndex + " is a even number");
            } else {
                System.out.println("Index " + myIndex + " is a odd number");
            }
        }
    }
}
