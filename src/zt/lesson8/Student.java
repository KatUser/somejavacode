package zt.lesson8;

public class Student {
    String name;
    int course;
    static int counter;
    int a;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        counter++;
    }

    public static void showCount() {
        System.out.println(counter);
    }

    public void showInfo() {
        System.out.println("Welcome!");
    }

    public void increase() { /* non-static method can use static & non-static variables */
        a++;
        counter++;
    }

    static void decrease() {
        counter++; /* only static variables */
    }
}

class StudentTest {
    public static void main(String[] args) {
        /* System.out.println(Student.counter);
        Student st1 = new Student("Petr", 1);
        Student.showCount(); */
    }
}
