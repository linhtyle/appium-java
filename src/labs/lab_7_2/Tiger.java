package labs.lab_7_2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static final int MAX_SPEED = 100;

    public Tiger(String name, int speed){
        super(name, speed);
        this.name = name;
        this.speed = new SecureRandom().nextInt(MAX_SPEED + 1);
    }
}