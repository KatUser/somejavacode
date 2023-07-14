package stepikLessons.box;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box() {
        this(10);
    };

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }

    public Box(Box anotherBox) {
        this(anotherBox.length,
                anotherBox.width,
                anotherBox.height);
    }

    Box copy() {
        return new Box(this.length, this.width, this.length);
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

    Box increase() {
        return new Box(this.length * 2,
                this.width * 2,
                this.height * 2);
    }

    public void showInfo() {
        System.out.print(this.length
                + " " + this.width
                + " " + this.height);
    }
}
