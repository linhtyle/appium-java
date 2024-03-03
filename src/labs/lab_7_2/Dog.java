package labs.lab_7_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    private static final int MAX_SPEED = 60;
    public Dog(String name, int speed){
        super(name, speed);
        this.name = name;
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}