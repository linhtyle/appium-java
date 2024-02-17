package labs.lab_6;

import java.util.Scanner;

public class Lab6_2 {

    public static void main(String[] args) {
    /*
    String myPassword = "password123";
    Allow user to input maximum 3 times
     */
        String myPassword = "password123";
        Scanner sc = new Scanner(System.in);
        String enteredPass;
        int allowTimes = 0;
        while (true){
            System.out.println("Please enter your password: ");
            enteredPass = sc.nextLine();
            if (enteredPass.equals(myPassword)){
                System.out.println("Your password is correct!");
                break;
            } else {
                System.out.println("Your password is incorrect");
                allowTimes++;
            } if (allowTimes == 3){
                System.out.println("You entered wrong password 3 times, stop program.");
                break;
            }
        }
    }
}