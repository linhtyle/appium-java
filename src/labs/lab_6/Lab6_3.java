package labs.lab_6;

import java.util.Arrays;

public class Lab6_3 {

    public static void main(String[] args) {
    /*
    String myStr = "100 minutes";
    NOT using REGEX, extract digit character from that String
    Expected output: "100".
    EX: "12345nabc678" -> "12345678"
     */
        String myString = "100 minutes";
        char[] charArray = myString.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for (char character: charArray){
            if (Character.isDigit(character)){
                System.out.println("The list of number from the given string: "+character);
            }
        }
    }
}