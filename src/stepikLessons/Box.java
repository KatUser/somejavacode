package stepikLessons;

public class Box {
    double length;
    double width;
    double height;

    Box() {
        this(10);
    };

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(double size) {
        this(size, size, size);
    }

    Box(Box anotherBox) {
        this(anotherBox.length,
                anotherBox.width,
                anotherBox.height);
    }

    double getVolume() {
        return this.length * this.width * this.height;
    }

    void printVolume() {
        System.out.println(getVolume());
    }

    void setDimension(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    void compareBoxes(Box anotherBox) {
        double currentVolume = getVolume();
        double anotherVolume = anotherBox.getVolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        } else {
            System.out.println("Current = Another");
        }
    }

    Box copy() {
        return new Box(this.length, this.width, this.length);
    }

    Box increase() {
        return new Box(this.length * 2,
                this.width * 2,
                this.height * 2);
    }
}
