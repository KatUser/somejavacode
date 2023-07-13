package stepikLessons.interfaces;

public class Cat extends Animal implements AbleToRun {
    @Override
    public void eat() {
        System.out.println("Cat's food");
    }

    @Override
    public void run() {
        System.out.println("Cat is running!!!!");
    }
}
