package stepikLessons.inheritance.shapes;

public class Rectangle extends Shape {

    Rectangle(int a,  int b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return (this.getA() + this.getB()) * 2;
    }
}
