package labs.lab_10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static labs.lab_10_1.AnimalBuilder.Builder;

public class RacingAnimalBuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        AnimalBuilder horse = builder.setName("Horse").setMaxSpeed(75).setFlyable(false).build();
        AnimalBuilder tiger = builder.setName("Tiger").setMaxSpeed(100).setFlyable(false).build();
        AnimalBuilder eagle = builder.setName("Eagle").setMaxSpeed(90).setFlyable(true).build();

        List<AnimalBuilder> animalList = new ArrayList<>(Arrays.asList(horse, tiger, eagle));
        System.out.println(AnimalController.getWinner(animalList));
    }
}