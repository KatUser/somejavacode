package stepikLessons;

public class Rectangle {
    double length;
    double width;

    void setParameters(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return this.length * this.width;
    }
}
