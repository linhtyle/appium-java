package labs.lab_6;

import java.util.Arrays;

public class Lab6_1 {

    public static void main(String[] args) {
    /*
    Given input string: "2hrs and 5 minutes"
    Please calculate how many minutes in total
     */
        String myString = "2hrs and 5 minutes";
        String[] charArray = myString.split("hrs and");
        System.out.println(Arrays.toString(charArray));
        charArray[1] = charArray[1].replace(" ", "").replace("minutes", "");
        int hours = Integer.parseInt(charArray[0]);
        int minutes = Integer.parseInt(charArray[1]);
        int totalMinutes = (hours*60)+minutes;
        System.out.println("Total minutes: " + totalMinutes);
    }
}