package stepikLessons.inheritance.shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println(rectangle.getPerimeter());
        Triangle triangle = new Triangle(5, 5, 5);
        System.out.println(triangle.getPerimeter());
    }
}
