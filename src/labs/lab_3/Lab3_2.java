package labs.lab_3;

public class Lab3_2 {
    /*
    Finding maximum value/minimum value from an integer array
    int[] intArr = {1, 2, 3, 4, 5};
    Minimum: 1
    Maximum: 5
     */
    public static void main(String[] args) {
        int[] myIntArr = {3, 2, 11, 9, 7};
        int minValue = myIntArr[0];
        int maxValue = myIntArr[0];
        for (int myIndex = 0; myIndex < myIntArr.length; myIndex++) {
            if (myIntArr[myIndex] < minValue) {
                minValue = myIntArr[myIndex];
            }
            if (myIntArr[myIndex] > maxValue){
                maxValue = myIntArr[myIndex];
            }
        }
        System.out.println("Minimum value is "+ minValue);
        System.out.println("Maximum value is "+ maxValue);
    }
}
