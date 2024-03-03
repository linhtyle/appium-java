package labs.lab_10_1;

import java.security.SecureRandom;

public class AnimalBuilder {
    private int maxSpeed;
    private String name;
    private boolean flyable;

    protected AnimalBuilder(Builder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.flyable = builder.flyable;
    }

    //READ-ONLY
    public boolean isFlyable() {
        return flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed(){
        return maxSpeed;
    }

    //INNER CLASS
    public static class Builder {
        protected int maxSpeed;
        protected String name;
        protected boolean flyable;
    //WRITE-ONLY
        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = new SecureRandom().nextInt(maxSpeed + 1);
            return this;
        }

        public int getRandomSpeed(int maxSpeed){
            return new SecureRandom().nextInt(maxSpeed + 1);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setFlyable(Boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalBuilder build() {
        return new AnimalBuilder(this);
    }
    }
}