package labs.lab_10_1;

import java.util.List;

public class AnimalController {
   public static String getWinner(List<AnimalBuilder> animalList) {
      String winnerName = "";
      int winnerSpeed = 0;
      for (AnimalBuilder animal : animalList) {
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