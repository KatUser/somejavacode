package cft.transport;

public class Civil extends AirTransport {
    int passengers;
    boolean hasBusinessClass;

    Civil(int passengers, boolean hasBusinessClass) {
        this.passengers = passengers;
        this.hasBusinessClass = hasBusinessClass;
    }
    void showInfo() {
        System.out.println();
    }
}
