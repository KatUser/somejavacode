package stepikLessons.interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly {
    @Override
    public void eat() {
        System.out.println("Bird's food");
    }

    @Override
    public void run() {
        System.out.println("Bird is running!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }
}
