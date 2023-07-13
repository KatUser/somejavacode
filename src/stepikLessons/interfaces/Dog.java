package stepikLessons.interfaces;

public class Dog extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Dog's food");
    }

    @Override
    public void run() {
        System.out.println("Dog is running!!!!");
    }
}
