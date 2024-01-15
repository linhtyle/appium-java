package labs.lab_2;

import java.util.Scanner;

public class Lab2_1 {
    /*
    Get input from user about height(m) and weight(kg) then calculate BMI
    Underweight = <18.5
    Normal weight = 18.5 – 24.9
    Overweight = 25–29.9
    Obesity = BMI of 30 or greater
    BMI = weight / (height x 2)
    Lab 2.1 + Suggest user to increase/decrease weight
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your height(m): ");
        double height = sc.nextDouble();
        System.out.println("Input your weight(kg): ");
        double weight = sc.nextDouble();
        double bmi = weight/(Math.pow(height,2));
        double expectedIncreaseWeight = 18.5 *(Math.pow(height,2));
        double expectedDecreaseWeight = 24.9 *(Math.pow(height,2));
        if (bmi < 18.5){
            System.out.println("Your BMI is "+ bmi);
            System.out.println("You are underweight, you should increase weight at least " + expectedIncreaseWeight + " kg");
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Your BMI is "+ bmi);
            System.out.println("You are normal weight, you should keep your current weight");
        }
        else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("Your BMI is "+ bmi);
            System.out.println("You are overweight, you should do more exercise and decrease " + expectedDecreaseWeight + " kg");
        }
        else {
            System.out.println("Your BMI is "+ bmi);
            System.out.println("You are obesity, you should diet and decrease " + expectedDecreaseWeight + " kg");
        }
    }
}
