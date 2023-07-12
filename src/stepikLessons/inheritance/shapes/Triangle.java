package stepikLessons.inheritance.shapes;

public class Triangle extends Shape {
    private double c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return this.getA()
                + this.getB() + c;
    }
}
