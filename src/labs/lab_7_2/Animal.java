package labs.lab_7_2;

public class Animal {
    protected int speed;
    protected String name;

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

  public int getSpeed(){
        return speed;
  }
}