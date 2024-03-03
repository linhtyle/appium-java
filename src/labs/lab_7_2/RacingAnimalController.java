package labs.lab_7_2;


import java.util.ArrayList;
import java.util.List;

public class RacingAnimalController {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        animal.add(new Horse("Horse", 75));
        animal.add(new Tiger("Tiger", 100));
        animal.add(new Dog("Dog", 60));
        System.out.println("" + getWinner(animal));

    }

    public static String getWinner(List <Animal> animalList) {
        String winnerName = "";
        int winnerSpeed = 0;
        for (Animal animal : animalList) {
            int maxSpeed = animal.getSpeed();
            System.out.println(animal.getName() + " with speed " + maxSpeed);
            if (animal.getSpeed() > winnerSpeed) {
                winnerSpeed = animal.getSpeed();
                winnerName = animal.getName();
            }
        }
        return "The winner is " + winnerName +", with speed: " + winnerSpeed;
    }
}