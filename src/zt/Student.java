package zt;

public class Student {
    int studentPass;
    String name;
    String surname;
    int course;
    double avgMathGrade;
    double avgLangGrade;
    double avgEconGrade;

    public Student(int studentPass, String name, String surname,
                   int course, double avgMathGrade,
                   double avgLangGrade, double avgEconGrade) {
        this.studentPass = studentPass;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.avgMathGrade = avgMathGrade;
        this.avgLangGrade = avgLangGrade;
        this.avgEconGrade = avgEconGrade;
    }

    public Student(){}

    public Student(int studentPass, String name) {
        this(studentPass, name, null, 0, 0.0, 0.0, 0.0);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(1, "Vasya");
        Student st3 = new Student(2, "Vasya", "Petrov", 1, 5.0, 5.0, 5.0);
        st1.avgEconGrade = 4;
        st1.avgLangGrade = 5;
        st1.avgMathGrade = 5;
        System.out.println((st1.avgEconGrade + st1.avgMathGrade + st1.avgLangGrade) / 3);
        System.out.println(st1.name);
        System.out.println(st2.surname);
        System.out.println(st3.course);
    }

}
