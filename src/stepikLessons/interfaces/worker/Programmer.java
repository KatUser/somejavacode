package stepikLessons.interfaces.worker;

public class Programmer implements Worker, Driver {
    @Override
    public void drive() {
        System.out.println("Programmer is driving");
    }

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }
}
