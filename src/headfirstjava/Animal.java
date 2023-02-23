package headfirstjava;

import java.util.Objects;

public abstract class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int boundaries;
    private int location;

    public void makeNoise() {
        System.out.println("Rr-r-r-r-r-r!");
    }

    public String eat(String food) {
        boolean foodIs = Objects.equals(food, "meat");
        return foodIs ? "Eats meat" : "Eats grass";
    }

    public String sleep() {
        return "Sleeping";
    }
    public String roam() {
        return "Roaming around";
    }
}
