package cft.transport;

public class Car extends LandTransport {
    String carBodyType;
    int passengers;
    Car(String carBodyType, int passengers) {
        this.carBodyType = carBodyType;
        this.passengers = passengers;
    }
    void showInfo() {
        System.out.println();
    }

    private int calculateDistance(int time) {
        return time / this.maxSpeed ;
    }
}
/*
*Для легкового разработать метод который будет принимать время и считать
сколько километров проедет машина двигаясь с максимальной скоростью и
сколько топлива она израсходует за это время, результат вывести в консоль,
расчёт израсходуемого топлива вынести в отдельный метод private.
 */