package labs.lab_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4 {
    /*
    Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
    After that, have a menu (You can use while loop) to have below options
    =====MENU======
    1. Print all numbers
    2. Print maximum value
    3. Print minimum value
    4. Search number
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = genRandomList();
        int orderNumber = 0;
        while (orderNumber != 1) {
            printMenu();
            System.out.println("Please enter your option: ");
            orderNumber = new Scanner(System.in).nextInt();
            switch (orderNumber) {
                case 1:
                    System.out.println("See you!");
                    break;
                case 2:
                    System.out.println("Array List: " + list);
                    break;
                case 3:
                    System.out.println("The maximum number is: " + findMaxNumber(list));
                    break;
                case 4:
                    System.out.println("The minimum number is: " + findMinNumber(list));
                    break;
                case 5:
                    System.out.print("Enter the number which you want to search: ");
                    int searchNumber = new Scanner(System.in).nextInt();
                    if (list.contains(searchNumber)){
                        System.out.println("The number " + searchNumber +" is existing in the arraylist with index ["+ list.indexOf(searchNumber) +"].");
                    }
                    else
                        System.out.println("The number " + searchNumber + " is not existing in the arraylist.");
                    break;
                default:
                    System.out.println("Something wrongs, please try again!");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("* * * MENU * * *\n" +
                "1. Exit.\n" +
                "2. Print all numbers.\n" +
                "3. Print maximum value.\n" +
                "4. Print minimum value.\n" +
                "5. Search number.");
    }

    public static ArrayList<Integer> genRandomList() {
        System.out.println("Please input the size of array list: ");
        int size = new Scanner(System.in).nextInt();
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            int randomNumber = random.nextInt(1000);
            list.add(randomNumber);
        }
        return list;
    }

    public static int findMaxNumber(ArrayList<Integer> list) {
        int maxNumber = list.get(0);
        for (int number : list) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        return maxNumber;
    }

    public static int findMinNumber(ArrayList<Integer> list) {
        int minNumber = list.get(0);
        for (int number : list) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}
