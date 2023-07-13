package stepikLessons.interfaces.worker;

public class Cook implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("Cook is working");
    }

    @Override
    public void drive() {
        System.out.println("Cook is driving");
    }
}
