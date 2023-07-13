package stepikLessons.interfaces.worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("Worker is working");
            }
        });

//        List<Worker> workers = new ArrayList<>();
//        workers.add(programmer);
//        workers.add(cook);
//        workers.forEach(Worker::work);

//        List<Driver> drivers = new ArrayList<>();
//        drivers.add(programmer);
//        drivers.add(cook);
//        drivers.forEach(Driver::drive);
//        Driver driver1 = (Driver) new Cook();
//        cook.drive();
//        Driver driver2 = (Driver) new Programmer();
//        programmer.drive();
    }
}
