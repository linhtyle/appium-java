package labs.lab_2;

import java.util.Scanner;

public class Lab2_2 {
    /*
    Lab 2.2:
    Allow user to input a number, print out it’s an odd or even number
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        if (number %2 ==0) {
            System.out.println(number + " is a even number");
        }
        else {
            System.out.println(number + " is a odd number");
        }
    }
}
