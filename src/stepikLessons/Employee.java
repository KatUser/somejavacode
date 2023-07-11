package stepikLessons;

public class Employee {
    String name;
    String position;
    double salary;

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    };

    void showInfo() {
        System.out.println(this.name
                + " " + this.position
                + " " + this.salary);
    }

}
