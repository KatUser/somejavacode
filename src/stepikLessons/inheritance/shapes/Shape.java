package stepikLessons.inheritance.shapes;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimeter();

    public final double getA() {
        return a;
    }

    public final double getB() {
        return b;
    }
}
