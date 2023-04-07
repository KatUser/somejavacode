package se.abst;

public class Main {
    public static void main(String[] args) {
        ToyotaCorolla tc1 = new ToyotaCorolla();
        Car tc2 = new ToyotaCorolla();
        tc2.go(); /*Методы ссылаются на Toyota Corolla */
        tc2.drive();
        tc2.stop();

        final int N = 4;
        Car cars[] = new Car[N];
        cars[0] = new ToyotaCorolla();
        cars[1] = new Korito();
        cars[2] = new ToyotaCorolla();
        cars[3] = new Korito();

        for (Car car : cars) {
            car.go();
            car.stop();
            car.drive();
        }

    }
}

abstract class Car { /*abstract class if at least one abstract method it has*/
    String model; /*знаем, что делать, но  хз КАК */
    public abstract void go(); /* Нельзя создать экз-о АК */
    public abstract void stop(); /*АК для наследования и конкретизации их работы */
    public abstract void drive();

    public void setModel(String model) {
        this.model = model;
    }
}

class ToyotaCorolla extends Car {

    public void go() {
        System.out.println("ToyotaCorolla goes");
    }
    public void stop() {
        System.out.println("ToyotaCorolla stops");
    }
    public void drive() {
        System.out.println("ToyotaCorolla is driven");
    }
}

class Korito extends Car {

    public void go() {
        System.out.println("Korito goes");
    }
    public void stop() {
        System.out.println("Korito stops");
    }
    public void drive() {
        System.out.println("Korito is driven");
    }
}